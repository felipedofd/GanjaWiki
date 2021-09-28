package com.example.ganjawiki.data

import com.google.gson.annotations.SerializedName

data class SeedCompany (@SerializedName("name") val name : String,
                        @SerializedName("ocpc") val ocpc : String)


