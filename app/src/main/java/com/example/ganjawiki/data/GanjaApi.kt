package com.example.ganjawiki.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GanjaApi {
    @GET("v1/strains")
    fun getStrains(
        @Query("?count=1000&sort=-createdAt") strain : String

    ) : Call<StrainResponse>
}