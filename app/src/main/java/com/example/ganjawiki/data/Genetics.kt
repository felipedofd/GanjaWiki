package com.example.ganjawiki.data

import com.google.gson.annotations.SerializedName

data class Genetics (@SerializedName("names") val names : String,
                     @SerializedName("ocpc") val ocpc : String)

