package com.ronik.android_clean_architecture_mvvm_compose.presentation.coin_detail

import com.ronik.android_clean_architecture_mvvm_compose.domain.model.CoinDetail



data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)