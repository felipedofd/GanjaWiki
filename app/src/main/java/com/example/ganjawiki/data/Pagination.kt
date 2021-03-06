package com.example.ganjawiki.data

import com.google.gson.annotations.SerializedName

data class Pagination (@SerializedName("total") val total : Int,
                       @SerializedName("count") val count : Int,
                       @SerializedName("per_page") val per_page : Int,
                       @SerializedName("current_page") val current_page : Int,
                       @SerializedName("total_pages") val total_pages : Int,
                       @SerializedName("links") val links : Links)


