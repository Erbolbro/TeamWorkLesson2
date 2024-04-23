package com.example.teamworklesson2.data.remote.apiservice

import com.example.teamworklesson2.data.model.NameAndDescriptionResponse
import retrofit2.http.GET
import retrofit2.http.Query

private const val END_POINT_15_GROUP = "android15groupapi"
interface Android15ApiService {

        @GET(END_POINT_15_GROUP)
        suspend fun getAnimeById(
            @Query("id") id: Int,
        ): NameAndDescriptionResponse

    }