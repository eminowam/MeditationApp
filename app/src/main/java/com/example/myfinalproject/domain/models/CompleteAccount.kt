package com.example.myfinalproject.domain.models

import com.google.gson.annotations.SerializedName

data class CompleteAccount (
    @SerializedName("chooseGender") val chooseGender: String,
    @SerializedName("dateOfBirth") val dateOfBirth: String,
    @SerializedName("yourWeight") val yourWeight: String,
    @SerializedName("yourHeight") val yourHeight: String,
        )