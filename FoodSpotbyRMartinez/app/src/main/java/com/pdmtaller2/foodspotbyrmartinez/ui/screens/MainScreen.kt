package com.pdmtaller2.foodspotbyrmartinez.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.pdmtaller2.foodspotbyrmartinez.ui.components.BottomNavigationBar
import com.pdmtaller2.foodspotbyrmartinez.ui.components.HomeScreenContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController) {
    val currentRoute = navController.currentBackStackEntry?.destination?.route ?: "Home"

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("FoodSpot", style = MaterialTheme.typography.titleLarge) }
            )
        },
        bottomBar = {
            BottomNavigationBar(navController = navController, currentRoute = currentRoute)
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (currentRoute) {
                "Home" -> HomeScreenContent()
                "Search" -> Text("Pantalla de búsqueda")
                "Orders" -> Text("Pantalla de órdenes")
                else -> Text("Pantalla no encontrada")
            }
        }
    }
}
