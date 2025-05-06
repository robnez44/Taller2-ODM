package com.pdmtaller2.foodspotbyrmartinez.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pdmtaller2.foodspotbyrmartinez.data.repository.restaurants
import com.pdmtaller2.foodspotbyrmartinez.ui.components.BottomNavigationBar
import com.pdmtaller2.foodspotbyrmartinez.ui.components.RestaurantCards

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    val groupedRestaurants = restaurants.groupBy { it.categories.first() }
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: "Home"

    Scaffold(
        topBar = { TopAppBar(title = { Text("FoodSpot") }) },
        bottomBar = {
            BottomNavigationBar(navController = navController, currentRoute = currentRoute)
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            groupedRestaurants.forEach { (category, restaurantList) ->
                item {
                    Text(
                        text = category,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)) {
                        items(restaurantList) { restaurant ->
                            RestaurantCards(navController = navController, restaurant = restaurant)
                        }
                    }
                }
            }
        }
    }
}
