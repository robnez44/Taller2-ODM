package com.pdmtaller2.foodspotbyrmartinez.ui.navigation

import android.net.Uri
import android.view.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2.foodspotbyrmartinez.data.model.Dish
import com.pdmtaller2.foodspotbyrmartinez.data.model.Restaurant
import com.pdmtaller2.foodspotbyrmartinez.data.repository.restaurants
import com.pdmtaller2.foodspotbyrmartinez.ui.screens.OrdersScreen
import com.pdmtaller2.foodspotbyrmartinez.ui.screens.MainScreen
import com.pdmtaller2.foodspotbyrmartinez.ui.screens.SearchScreen
import com.pdmtaller2.foodspotbyrmartinez.ui.screens.MenuScreen
import com.pdmtaller2.foodspotbyrmartinez.ui.screens.OrdersScreen
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Composable
fun NavigationController(  navController: NavHostController,
                           modifier: Modifier = Modifier) {

    val cartItems = remember { mutableStateListOf<Pair<Dish, Int>>() }

    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            MainScreen(navController = navController)
        }
        composable("Search") {
            SearchScreen(navController = navController)
        }
        composable("Orders") {
            OrdersScreen(navController = navController)
        }
        composable("Menu/{restaurntId}") { backStackEntry ->

            val restaurantId = backStackEntry.arguments?.getString("restaurntId")?.toIntOrNull()
            restaurantId?.let { id ->
                MenuScreen(navController = navController, restaurantId = id)
            }


            }
        }
    }
