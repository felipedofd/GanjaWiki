package com.example.ganjawiki.data

import com.google.gson.annotations.SerializedName

data class Genetics (@SerializedName("name") val name : String,
                     @SerializedName("ocpc") val ocpc : String,
                     @SerializedName("qr") val qr : String,
                     @SerializedName("url") val url : String,
                     @SerializedName("image") val image : String,
                     @SerializedName("seedCompany") val seedCompany : SeedCompany,
                     @SerializedName("genetics") val genetics : Genetics,
                     @SerializedName("lineage") val lineage : Lineage,
                     @SerializedName("children") val children : Boolean,
                     @SerializedName("createdAt") val createdAt : String,
                     @SerializedName("updatedAt") val updatedAt : String)


