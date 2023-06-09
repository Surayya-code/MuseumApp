package com.example.museumapp.model


import com.google.gson.annotations.SerializedName

data class CityResponse(
    @SerializedName("data")
    val `data`: List<CityData>,
    @SerializedName("message")
    val message: String,
    @SerializedName("rowCount")
    val rowCount: Int,
    @SerializedName("status")
    val status: String
)