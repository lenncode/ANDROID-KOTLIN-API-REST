package com.lenncode.kotlin_api_rest

import com.google.gson.annotations.SerializedName

data class DogsResponse(
    @SerializedName(value = "status")
    var status: String,
    @SerializedName(value = "message")
    var images: List<String>

)
