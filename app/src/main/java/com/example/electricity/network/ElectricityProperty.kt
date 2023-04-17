package com.example.electricity.network

import com.squareup.moshi.Json

data class ElectricityProperty(
    val id : String,
    val Home : String,
    val Voltage : String,
    val Current : String,
    val Power : String,
    val Energy : String,
    val Frequency : String,
    val PF : String,
    @Json(name = "reading_time") val time : String
)