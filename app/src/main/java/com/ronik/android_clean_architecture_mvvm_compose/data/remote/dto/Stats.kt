package com.ronik.android_clean_architecture_mvvm_compose.data.remote.dto

data class Stats(
    val contributors: Int,
    val followers: Int,
    val stars: Int,
    val subscribers: Int
)