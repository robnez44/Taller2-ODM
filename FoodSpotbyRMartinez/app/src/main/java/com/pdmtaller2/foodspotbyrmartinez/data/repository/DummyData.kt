package com.pdmtaller2.foodspotbyrmartinez.data.repository
import com.pdmtaller2.foodspotbyrmartinez.data.model.Dish
import com.pdmtaller2.foodspotbyrmartinez.data.model.Restaurant

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Hut",
        description = "Las mejores pizzas con ingredientes frescos.",
        imageURL = "https://media.cnn.com/api/v1/images/stellar/prod/cnne-664851-190625100035-02-pizza-hut-super-tease.jpg?q=w_1110,c_fill",
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
        imageURL = "https://cdn.sanity.io/images/czqk28jt/prod_bk_ch/6cec64d8a6d42cd670985df04c98a9fa675a4b09-600x300.jpg",
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
        imageURL = "https://thefoodtech.com/wp-content/uploads/2023/07/kfc.jpg",
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
        imageURL = "https://www.foodandwine.com/thmb/8N5jLutuTK4TDzpDkhMfdaHLZxI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/McDonalds-Hacks-Menu-FT-1-BLOG0122-4ac9d62f6c9143be8da3d0a8553348b0.jpg",
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
        imageURL = "https://media.telemundo52.com/2023/02/GettyImages-1456041072.jpg?quality=85&strip=all&resize=1200%2C675",
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
        imageURL = "https://eu-images.contentstack.com/v3/assets/bltea7aee2fca050a19/blte760221b980976d1/67bf5eb3bdedb66929b042f6/pexels-pinamon-5646379.jpg?width=1280&auto=webp&quality=95&format=jpg&disable=upscale",
        categories = listOf("Bebidas", "Café"),
        menu = listOf(
            Dish(26, "Frappuccino Vainilla", "Bebida fría con vainilla y crema.", "https://example.com/frappuccino.jpg"),
            Dish(27, "Latte Macchiato", "Café con leche y espuma cremosa.", "https://example.com/latte.jpg"),
            Dish(28, "Espresso", "Café concentrado con sabor intenso.", "https://example.com/espresso.jpg"),
            Dish(29, "Muffin de Arándanos", "Muffin esponjoso con arándanos.", "https://example.com/muffin.jpg"),
            Dish(30, "Té Chai Latte", "Infusión de té chai con leche caliente.", "https://example.com/chai.jpg")
        )
    ),
    Restaurant(
        id = 7,
        name = "Go Green",
        description = "Comida saludable y fresca con ingredientes naturales.",
        imageURL = "https://grupogogreen.com/sv/wp-content/uploads/2022/07/IGOS-1.png",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(31, "Bowl Silvestre", "Bowl con quinoa, vegetales y aderezo especial.", "https://example.com/silvestre.jpg"),
            Dish(32, "Ensalada Santa Fe", "Ensalada con pollo, frijoles negros y maíz.", "https://example.com/santafe.jpg"),
            Dish(33, "Smoothie de Mango", "Bebida refrescante de mango natural.", "https://example.com/smoothie.jpg")
        )
    ),

    Restaurant(
        id = 8,
        name = "Pastaria",
        description = "Auténtica comida italiana con pastas y pizzas artesanales.",
        imageURL = "https://www.chsglobe.com/wp-content/uploads/2018/01/Pasteria-1-of-4-1-900x600.jpg",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(34, "Pasta Alfredo", "Pasta con salsa cremosa de queso parmesano.", "https://example.com/alfredo.jpg"),
            Dish(35, "Pizza Margherita", "Pizza clásica con tomate, mozzarella y albahaca.", "https://example.com/margherita.jpg"),
            Dish(36, "Bruschetta", "Pan tostado con tomate, ajo y albahaca.", "https://example.com/bruschetta.jpg")
        )
    ),

    Restaurant(
        id = 9,
        name = "The Coffee Cup",
        description = "Café premium y bebidas especiales en un ambiente acogedor.",
        imageURL = "https://pbs.twimg.com/media/EhE5arJWkAA3TKp.jpg",
        categories = listOf("Bebidas", "Café"),
        menu = listOf(
            Dish(37, "Latte Macchiato", "Café con leche y espuma cremosa.", "https://example.com/latte.jpg"),
            Dish(38, "Frappuccino de Vainilla", "Bebida fría con vainilla y crema.", "https://example.com/frappuccino.jpg"),
            Dish(39, "Té Chai Latte", "Infusión de té chai con leche caliente.", "https://example.com/chai.jpg")
        )
    )
)
