package com.example.lovecalculator

import com.google.gson.annotations.SerializedName

data class
CalculateLoveResponse (
    @SerializedName("fname") val fname: String = "",
    @SerializedName("sname") val sname: String = "",
    @SerializedName("percentage") val percentage: String = "",
    @SerializedName("result") val description: String = "",
    @SerializedName("message") val message: String = "")