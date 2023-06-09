package com.example.museumapp.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CityData(
    @SerializedName("id")
    val id: Int,
    @SerializedName("sehir")
    val sehir: String,
    @SerializedName("slug")
    val slug: String
):Parcelable