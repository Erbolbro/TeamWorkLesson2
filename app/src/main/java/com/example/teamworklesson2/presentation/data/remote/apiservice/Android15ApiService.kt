package com.example.teamworklesson2.presentation.data.remote.apiservice

import com.example.teamworklesson2.presentation.data.model.NameAndDescriptionResponse
import retrofit2.http.GET
import retrofit2.http.Query

private const val END_POINT_15_GROUP = "android15groupapi"

interface Android15ApiService {
    @GET(END_POINT_15_GROUP)
    suspend fun getAndroid15group(
        @Query("id") id: Int = 0,
    ): NameAndDescriptionResponse

}