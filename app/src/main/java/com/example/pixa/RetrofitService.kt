package com.example.pixa

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    var api = retrofit.create(PixaApi::class.java)
}