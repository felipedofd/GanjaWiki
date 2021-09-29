package com.example.ganjawiki.data

import com.google.gson.annotations.SerializedName

data class Data (@SerializedName("name") val name : String,
                 @SerializedName("ocpc") val ocpc : String,
                 @SerializedName("qr") val qr : String,
                 @SerializedName("url") val url : String,
                 @SerializedName("image") val image : String,
                 @SerializedName("genetics") val genetics : Genetics,
                 @SerializedName("createdAt") val createdAt : String,
                 @SerializedName("updatedAt") val updatedAt : String)


