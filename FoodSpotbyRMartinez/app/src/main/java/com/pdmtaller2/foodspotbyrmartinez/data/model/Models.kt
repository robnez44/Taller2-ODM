package com.pdmtaller2.foodspotbyrmartinez.data.model

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageURL: String
)

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageURL: String,
    val categories: List<String>,
    val menu: List<Dish>
)