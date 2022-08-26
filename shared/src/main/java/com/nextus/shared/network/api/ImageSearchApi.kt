package com.nextus.shared.network.api

import com.nextus.model.ImageSearchData
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Query

interface ImageSearchApi {

    @GET("image")
    fun searchImage(@Query("page") page: Int, @Query("query") query: String): Call<ImageSearchData>

}