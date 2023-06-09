package com.example.museumapp.api

import com.example.museumapp.model.CityResponse
import com.example.museumapp.utils.Constants.API_KEY
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface MuseumApi {
    @GET("getCity")
    @Headers("Content-Type: application/json","Authorization: Bearer $API_KEY")
    fun getAllCity():Call<CityResponse>
}