package com.ronik.android_clean_architecture_mvvm_compose.presentation

sealed class Screen(val route:String) {
    object CoinListScreen : Screen(route = "coin_list_screen")
    object CoinDetailsScreen : Screen(route = "coin_detail_screen")
}