package com.ronik.android_clean_architecture_mvvm_compose.data.remote.dto

import com.google.gson.annotations.SerializedName


data class Tag(
    @SerializedName("coin_counter")
    val coinCounter: Int,
    @SerializedName("ico_counter")
    val icoCounter: Int,
    val id: String,
    val name: String
)