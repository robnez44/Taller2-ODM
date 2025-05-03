package com.pdmtaller2.foodspotbyrmartinez.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.foodspotbyrmartinez.ui.screens.MainScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavigationController(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            MainScreen(navController = navController)
        }
        composable("Search") {
            MainScreen(navController = navController)
        }
        composable("Orders") {
            MainScreen(navController = navController)
        }
    }
}
