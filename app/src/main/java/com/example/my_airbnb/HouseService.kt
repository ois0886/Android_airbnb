package com.example.my_airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {

    @GET("/v3/83993d24-8b5e-490d-81a9-2a5a39037130")
    fun getHouseList(): Call<HouseDto>

}