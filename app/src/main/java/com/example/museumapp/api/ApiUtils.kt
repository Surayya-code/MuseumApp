package com.example.museumapp.api

import com.example.museumapp.utils.Constants.BASE_URL
import retrofit2.create

class ApiUtils {
    companion object{
        fun getMuseumApi():MuseumApi{
            return  RetrofitClient.getRetrofitClient(BASE_URL).create(MuseumApi::class.java)

        }
    }
}