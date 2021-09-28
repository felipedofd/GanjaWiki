package com.example.ganjawiki


data class ListItems(
    val nome: String,
    val efeitos: String,
    val variedade: String,
    val description: String,
    val country: String,
    val imageToPlant: String,

    val info: List<ListItems>
)
