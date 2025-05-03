package com.pdmtaller2.foodspotbyrmartinez.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.foodspotbyrmartinez.data.repository.restaurants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreenContent(navController: NavController) {
    val groupedRestaurants = restaurants.groupBy { it.categories.first() }

        LazyColumn(modifier = Modifier.padding(8.dp).fillMaxSize()) {
            groupedRestaurants.forEach { (category, list) ->
                item {
                    Text(
                        text = category,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)) {
                        items(list) { restaurant ->
                            RestaurantCards(restaurant = restaurant)
                        }
                    }
                }
            }
        }
}