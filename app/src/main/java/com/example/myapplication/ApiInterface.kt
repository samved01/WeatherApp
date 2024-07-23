package com.example.myapplication

//import android.telecom.Call
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather")
    fun getweatherapp(
        @Query("q") city:String,
        @Query("appid") appid:String,
        @Query("units") units:String
    ): Call<weatherapp>
}