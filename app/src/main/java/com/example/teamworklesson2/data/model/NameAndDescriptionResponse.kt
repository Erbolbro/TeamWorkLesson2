package com.example.teamworklesson2.data.model

import com.google.gson.annotations.SerializedName

data class NameAndDescriptionResponse(
    @SerializedName("id")
    val id: IdName,
    @SerializedName("author")
    val author: Author,
    @SerializedName("quote")
    val quote: Quote
)
