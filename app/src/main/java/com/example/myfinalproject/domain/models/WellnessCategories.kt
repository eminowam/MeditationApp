package com.example.myfinalproject.domain.models

import com.google.gson.annotations.SerializedName

data class WellnessCategories(
    @SerializedName("nutrition") val nutrition: String,
    @SerializedName("heart") val heart: String,
    @SerializedName("breathing") val breathing: String,
    @SerializedName("dream") val dream: String,
    @SerializedName("otherData") val otherData: String,
)
