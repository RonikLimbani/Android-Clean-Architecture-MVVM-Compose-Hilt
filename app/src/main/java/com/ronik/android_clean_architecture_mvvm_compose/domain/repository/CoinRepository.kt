package com.ronik.android_clean_architecture_mvvm_compose.domain.repository

import com.ronik.android_clean_architecture_mvvm_compose.data.remote.dto.CoinDetailDto
import com.ronik.android_clean_architecture_mvvm_compose.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins():List<CoinDto>
    suspend fun getCoinById(coinId:String):CoinDetailDto
}