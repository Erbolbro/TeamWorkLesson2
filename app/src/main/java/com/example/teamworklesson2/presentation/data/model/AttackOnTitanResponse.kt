package com.example.teamworklesson2.presentation.data.model

import com.google.gson.annotations.SerializedName

data class AttackOnTitanResponse(
    @SerializedName("result")
    val result: AttackOnTitanResult
)
