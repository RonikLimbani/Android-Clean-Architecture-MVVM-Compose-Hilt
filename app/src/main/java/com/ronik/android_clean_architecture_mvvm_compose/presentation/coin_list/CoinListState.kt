package com.ronik.android_clean_architecture_mvvm_compose.presentation.coin_list

import com.ronik.android_clean_architecture_mvvm_compose.domain.model.Coin
import java.lang.Error


data class CoinListState(
    val isLoading :Boolean=false,
    val coins:List<Coin> = emptyList(),
    val error: String = ""
)