package com.pdmtaller2.foodspotbyrmartinez.data.repository
import com.pdmtaller2.foodspotbyrmartinez.data.model.Dish
import com.pdmtaller2.foodspotbyrmartinez.data.model.Restaurant

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Hut",
        description = "Las mejores pizzas con ingredientes frescos.",
        imageURL = "https://example.com/pizzahut.jpg",
        categories = listOf("Comida Italiana", "Pizza"),
        menu = listOf(
            Dish(1, "Pizza Suprema", "Pizza con pepperoni, pimientos, cebolla y champiñones.", "https://example.com/supreme.jpg"),
            Dish(2, "Pizza Margarita", "Pizza clásica con queso mozzarella y tomate.", "https://example.com/margarita.jpg"),
            Dish(3, "Pizza BBQ Chicken", "Pizza con pollo a la barbacoa y cebolla.", "https://example.com/bbqchicken.jpg"),
            Dish(4, "Pizza de Queso", "Pizza con mezcla de quesos derretidos.", "https://example.com/cheese.jpg"),
            Dish(5, "Pizza Pepperoni", "Pizza con abundante pepperoni.", "https://example.com/pepperoni.jpg")
        )
    ),
    Restaurant(
        id = 2,
        name = "Burger King",
        description = "Hamburguesas flameadas y frescas.",
        imageURL = "https://example.com/burgerking.jpg",
        categories = listOf("Comida Rápida", "Hamburguesas"),
        menu = listOf(
            Dish(6, "Whopper", "Hamburguesa con carne flameada y vegetales frescos.", "https://example.com/whopper.jpg"),
            Dish(7, "Whopper Doble", "Versión doble del clásico Whopper.", "https://example.com/doublewhopper.jpg"),
            Dish(8, "Chicken Fries", "Tiras de pollo crujientes.", "https://example.com/chickenfries.jpg"),
            Dish(9, "Hamburguesa Veggie", "Opción sin carne con vegetales frescos.", "https://example.com/veggie.jpg"),
            Dish(10, "Papas Fritas", "Papas fritas crujientes y doradas.", "https://example.com/fries.jpg")
        )
    ),
    Restaurant(
        id = 3,
        name = "KFC",
        description = "Pollo crujiente con receta original.",
        imageURL = "https://example.com/kfc.jpg",
        categories = listOf("Comida Rápida", "Pollo"),
        menu = listOf(
            Dish(11, "Pollo Original", "Receta secreta de pollo crujiente.", "https://example.com/originalchicken.jpg"),
            Dish(12, "Tenders", "Tiras de pollo jugosas y crujientes.", "https://example.com/tenders.jpg"),
            Dish(13, "Twister", "Wrap con pollo y ensalada.", "https://example.com/twister.jpg"),
            Dish(14, "Papas Cajún", "Papas sazonadas estilo cajún.", "https://example.com/cajunfries.jpg"),
            Dish(15, "Mac & Cheese", "Macarrones con queso cremoso.", "https://example.com/macandcheese.jpg")
        )
    ),
    Restaurant(
        id = 4,
        name = "McDonald's",
        description = "La clásica comida rápida favorita de todos.",
        imageURL = "https://example.com/mcdonalds.jpg",
        categories = listOf("Comida Rápida", "Hamburguesas"),
        menu = listOf(
            Dish(16, "Big Mac", "Hamburguesa icónica con salsa especial.", "https://example.com/bigmac.jpg"),
            Dish(17, "McNuggets", "Nuggets de pollo dorados y crujientes.", "https://example.com/mcnuggets.jpg"),
            Dish(18, "McFlurry Oreo", "Helado cremoso con galletas Oreo.", "https://example.com/mcflurry.jpg"),
            Dish(19, "McPollo", "Hamburguesa de pollo con mayonesa.", "https://example.com/mcpollo.jpg"),
            Dish(20, "Papas Grandes", "Papas fritas clásicas de McDonald's.", "https://example.com/fries.jpg")
        )
    ),
    Restaurant(
        id = 5,
        name = "Subway",
        description = "Sándwiches frescos y personalizados.",
        imageURL = "https://example.com/subway.jpg",
        categories = listOf("Comida Saludable", "Sándwiches"),
        menu = listOf(
            Dish(21, "Italian BMT", "Sándwich con peperoni, salami y jamón.", "https://example.com/italianbmt.jpg"),
            Dish(22, "Sub de Pollo", "Sándwich con pollo y vegetales frescos.", "https://example.com/chickensub.jpg"),
            Dish(23, "Veggie Delight", "Opción vegetariana con queso y vegetales.", "https://example.com/veggie.jpg"),
            Dish(24, "Sub de Atún", "Sándwich clásico con atún y mayonesa.", "https://example.com/tuna.jpg"),
            Dish(25, "Cookies Subway", "Galletas con trozos de chocolate.", "https://example.com/cookies.jpg")
        )
    ),
    Restaurant(
        id = 6,
        name = "Starbucks",
        description = "Café premium y bebidas especiales.",
        imageURL = "https://example.com/starbucks.jpg",
        categories = listOf("Bebidas", "Café"),
        menu = listOf(
            Dish(26, "Frappuccino Vainilla", "Bebida fría con vainilla y crema.", "https://example.com/frappuccino.jpg"),
            Dish(27, "Latte Macchiato", "Café con leche y espuma cremosa.", "https://example.com/latte.jpg"),
            Dish(28, "Espresso", "Café concentrado con sabor intenso.", "https://example.com/espresso.jpg"),
            Dish(29, "Muffin de Arándanos", "Muffin esponjoso con arándanos.", "https://example.com/muffin.jpg"),
            Dish(30, "Té Chai Latte", "Infusión de té chai con leche caliente.", "https://example.com/chai.jpg")
        )
    )
)
