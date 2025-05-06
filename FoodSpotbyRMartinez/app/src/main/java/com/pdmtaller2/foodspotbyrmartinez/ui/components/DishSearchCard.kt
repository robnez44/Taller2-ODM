package com.pdmtaller2.foodspotbyrmartinez.ui.components

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.pdmtaller2.foodspotbyrmartinez.data.model.Dish

@Composable
fun DishSearchCard(dish: Dish, restaurantName: String, cartItems: SnapshotStateList<Pair<Dish, Int>>) {
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(dish.imageURL)
                    .crossfade(true)
                    .build(),
                contentDescription = "Imagen del platillo",
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(dish.name, style = MaterialTheme.typography.bodyLarge)
            Text(restaurantName, style = MaterialTheme.typography.bodySmall)
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {
                    if (!cartItems.any { it.first.id == dish.id }) {
                        cartItems.add(dish to 1)
                    }
                    Toast.makeText(context, "${dish.name} agregado", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Agregar")
            }
        }
    }
}
