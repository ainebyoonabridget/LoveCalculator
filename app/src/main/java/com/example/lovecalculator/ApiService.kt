package com.example.lovecalculator

import android.content.Context
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {
    @GET("getPercentage")
    fun calculateLovePercentage(
        @Header("x-rapidapi-host") xRapidApiHost: String,
        @Header("x-rapidapi-Key") xRapidApiKey: String,
        @Query("fname") firstPersonName: String,
        @Query("sname") secondPersonName: String
    ): Single<CalculateLoveResponse>
    companion object {
        fun create(context: Context): ApiService {
            val retrofit = Retrofit
                .Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://love-calculator.p.rapidapi.com/") //Put this in app gradle
                .build()
            return retrofit.create(ApiService::class.java)
        }
    }
}
