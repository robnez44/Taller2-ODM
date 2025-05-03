package com.pdmtaller2.foodspotbyrmartinez.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

data class NavItem(val label: String, val icon: ImageVector, val route: String)

@Composable
fun BottomNavigationBar(navController: NavHostController, currentRoute: String) {
    val items = listOf(
        NavItem("Listado", Icons.Default.List, "Home"),
        NavItem("Busqueda", Icons.Default.Search, "Search"),
        NavItem("Mis ordenes", Icons.Default.ShoppingCart, "Orders")
    )

    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) }
            )
        }
    }
}
