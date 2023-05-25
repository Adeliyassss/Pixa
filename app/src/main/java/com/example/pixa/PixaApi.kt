package com.example.pixa

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {
    @GET("api/")
    fun searchImage(
        @Query("q") keyWord: String,
        @Query("page") page: Int= 1,
        @Query("per_page") perPage: Int= 3,
        @Query("key") key: String = "36717731-d51951a551f7be7c5c8b5fc3f",
    ): Call<PixaModel>
}