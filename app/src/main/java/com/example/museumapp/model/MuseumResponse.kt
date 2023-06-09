package com.example.museumapp.model


data class MuseumResponse(
    val `data`: List<MuseumData>,
    val message: String,
    val rowCount: Int,
    val status: String
)