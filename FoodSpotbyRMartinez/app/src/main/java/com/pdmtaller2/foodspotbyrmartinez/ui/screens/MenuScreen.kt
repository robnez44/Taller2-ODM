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
    var searchQuery by remember { mutableStateOf("") }
    val context = LocalContext.current

    val filteredMenu = restaurant.menu.filter { dish ->
        dish.name.contains(searchQuery, ignoreCase = true)
    }

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

            LazyColumn {
                items(filteredMenu) { dish ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        elevation = CardDefaults.cardElevation(4.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text(text = dish.name, style = MaterialTheme.typography.bodyLarge)
                                Text(text = dish.description, style = MaterialTheme.typography.bodySmall)
                            }
                            Button(
                                onClick = {
                                    Toast.makeText(context, "${dish.name} agregado", Toast.LENGTH_SHORT).show()
                                }
                            ) {
                                Text("Agregar")
                            }
                        }
                    }
                }
            }
        }
    }
}
