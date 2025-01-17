package com.ronik.android_clean_architecture_mvvm_compose.domain.model



data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
