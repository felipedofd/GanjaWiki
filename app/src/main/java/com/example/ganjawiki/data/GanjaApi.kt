package com.example.ganjawiki.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GanjaApi {
    @GET("v1/strains")
    fun getStrains(
        @Query("count") count : Int,
        @Query("sort")sort: String
    ) : Call<StrainResponse>
}