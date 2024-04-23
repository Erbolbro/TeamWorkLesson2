package com.example.teamworklesson2.presentation.data.model

import com.google.gson.annotations.SerializedName

data class AttackOnTitanResult(
    @SerializedName("img")
    val img: String,
    @SerializedName("name")
    val name: String
)
