package com.example.electricity.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.GET

private val BASE_URL = "https://www.xxxxxxxx.xxx" // replace with your domain, example: https://www.rizzsmartenergy.com

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface ElectricityApiService {
    @GET("get-my-data.php")// replace with your php file (lihat README.md)
    suspend fun getProperties() : List<ElectricityProperty>
}

object ElectricityApi {
    val retrofitService : ElectricityApiService by lazy {
        retrofit.create(ElectricityApiService::class.java)
    }
}