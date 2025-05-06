package com.pdmtaller2.foodspotbyrmartinez.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.pdmtaller2.foodspotbyrmartinez.data.model.Dish
import com.pdmtaller2.foodspotbyrmartinez.data.model.Restaurant
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.navigation.NavController
import com.pdmtaller2.foodspotbyrmartinez.data.repository.restaurants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(
    navController: NavController,
    restaurantId: Int
) {
    val restaurant = restaurants.find { it.id == restaurantId } ?: return


}