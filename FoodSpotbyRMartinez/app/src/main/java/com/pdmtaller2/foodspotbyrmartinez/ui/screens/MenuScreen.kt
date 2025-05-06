package com.pdmtaller2.foodspotbyrmartinez.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.pdmtaller2.foodspotbyrmartinez.data.model.Dish
import com.pdmtaller2.foodspotbyrmartinez.data.model.Restaurant
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.navigation.NavController
import com.pdmtaller2.foodspotbyrmartinez.data.repository.restaurants
import com.pdmtaller2.foodspotbyrmartinez.ui.components.BottomNavigationBar
import com.pdmtaller2.foodspotbyrmartinez.ui.components.DishCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(
    navController: NavController,
    restaurantId: Int,
    cartItems: SnapshotStateList<Pair<Dish, Int>>
) {
    val restaurant = restaurants.find { it.id == restaurantId } ?: return
    var searchQuery by remember { mutableStateOf("") }
    val context = LocalContext.current

    val filteredMenu = restaurant.menu.filter { dish ->
        dish.name.contains(searchQuery, ignoreCase = true)
    }

    val rows = filteredMenu.chunked(2)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(restaurant.name) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        },
        bottomBar = {
            BottomNavigationBar(navController = navController, currentRoute = "Menu")
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                label = { Text("Search") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(rows) { rowDishes ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        for (dish in rowDishes) {
                            DishCard(
                                dish = dish,
                                onAddClicked = {
                                    if (!cartItems.any { it.first.id == dish.id }) {
                                        cartItems.add(dish to 1)
                                    }
                                    Toast.makeText(context, "${dish.name} agregado", Toast.LENGTH_SHORT).show()
                                },
                                modifier = Modifier.weight(1f)
                            )
                        }
                        if (rowDishes.size == 1) {
                            Spacer(modifier = Modifier.weight(1f))
                        }
                    }
                }
            }
        }
    }
}