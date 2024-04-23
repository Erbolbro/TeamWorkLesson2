package com.example.teamworklesson2.presentation.data.model

import com.google.gson.annotations.SerializedName

data class NameAndDescriptionResponse(
    @SerializedName("author")
    val author: String,
    @SerializedName("quote")
    val quote: String
)
