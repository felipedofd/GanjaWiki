package com.example.ganjawiki.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.otreeba.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun ganjaApi() : GanjaApi{
        return retrofit.create(GanjaApi::class.java)
    }

}