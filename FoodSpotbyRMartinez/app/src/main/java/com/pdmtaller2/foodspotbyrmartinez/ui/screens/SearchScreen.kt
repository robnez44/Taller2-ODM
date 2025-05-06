package com.pdmtaller2.foodspotbyrmartinez.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.foodspotbyrmartinez.data.model.Dish
import com.pdmtaller2.foodspotbyrmartinez.data.repository.restaurants
import com.pdmtaller2.foodspotbyrmartinez.ui.components.BottomNavigationBar
import com.pdmtaller2.foodspotbyrmartinez.ui.components.DishSearchCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController, cartItems: SnapshotStateList<Pair<Dish, Int>>) {
    var searchQuery by remember { mutableStateOf("") }

    val allDishes = restaurants.flatMap { restaurant ->
        restaurant.menu.map { dish -> restaurant.name to dish }
    }

    val filteredDishes = allDishes.filter { (_, dish) ->
        dish.name.contains(searchQuery, ignoreCase = true)
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Buscar platillos") })
        },
        bottomBar = {
            BottomNavigationBar(navController = navController, currentRoute = "Search")
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                label = { Text("Buscar") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn {
                itemsIndexed(filteredDishes.chunked(2)) { _, rowItems ->
                    Row(modifier = Modifier.fillMaxWidth()) {
                        for ((restaurantName, dish) in rowItems) {
                            Box(modifier = Modifier.weight(1f)) {
                                DishSearchCard(dish = dish, restaurantName = restaurantName, cartItems)
                            }
                        }
                        if (rowItems.size == 1) {
                            Spacer(modifier = Modifier.weight(1f))
                        }
                    }
                }
            }
        }
    }
}
