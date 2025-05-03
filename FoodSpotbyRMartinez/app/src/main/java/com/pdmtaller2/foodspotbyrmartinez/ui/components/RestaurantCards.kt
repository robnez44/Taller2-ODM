package com.pdmtaller2.foodspotbyrmartinez.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.pdmtaller2.foodspotbyrmartinez.data.model.Restaurant

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantCards(restaurant: Restaurant) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp * 0.75f

    Card(
        modifier = Modifier
            .width(screenWidth)
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE8E8E8),
            contentColor = Color.White,
        )
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(restaurant.imageURL)
                    .crossfade(true)
                    .build(),
                contentDescription = "Imagen del restaurante",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp),
                contentScale = ContentScale.Crop
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = restaurant.name, style = MaterialTheme.typography.headlineSmall)
            }
        }
    }
}

@Composable
@Preview
fun CardsPreview() {
    val res = Restaurant(
        id = 1,
        name = "KFC",
        description = "Famoso por su pollo frito",
        imageURL = "https://upload.wikimedia.org/wikipedia/sco/thumb/b/bf/KFC_logo.svg/1200px-KFC_logo.svg.png",
        categories = listOf("Fast Food"),
        menu = listOf()
    )
    RestaurantCards(restaurant = res)
}
