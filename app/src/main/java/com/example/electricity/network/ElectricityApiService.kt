package com.example.electricity.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.GET

private val BASE_URL = "https://www.xxxxxxxx.xxx" // diisi dengan domain web hosting

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface ElectricityApiService {
    @GET("get-my-data.php")// diisi dengan file json anda (lihat README.md)
    suspend fun getProperties() : List<ElectricityProperty>
}

object ElectricityApi {
    val retrofitService : ElectricityApiService by lazy {
        retrofit.create(ElectricityApiService::class.java)
    }
}