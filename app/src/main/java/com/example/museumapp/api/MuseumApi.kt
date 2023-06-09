package com.example.museumapp.api

import com.example.museumapp.model.CityResponse
import com.example.museumapp.model.MuseumResponse
import com.example.museumapp.utils.Constants.API_KEY
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface MuseumApi {
    @GET("getCity")
    @Headers("Content-Type: application/json","Authorization: Bearer $API_KEY")
    fun getAllCity():Call<CityResponse>

    @GET("getMuseum")
    @Headers("Content-Type: application/json","Authorization: Bearer $API_KEY")
    fun getAllMuseum(@Query("city")city:String):Call<MuseumResponse>
}