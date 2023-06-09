package com.example.museumapp.model


import com.google.gson.annotations.SerializedName

data class CityData(
    @SerializedName("id")
    val id: Int,
    @SerializedName("sehir")
    val sehir: String,
    @SerializedName("slug")
    val slug: String
)