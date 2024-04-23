package com.example.teamworklesson2.presentation.data.remote.apiservice

import com.example.teamworklesson2.presentation.data.model.AttackOnTitanResponse
import retrofit2.http.GET

private const val END_POINT_15_GROUP = "characters"

interface Android15ApiService {
    @GET(END_POINT_15_GROUP)
    suspend fun getAndroid15group(
    ): AttackOnTitanResponse
}