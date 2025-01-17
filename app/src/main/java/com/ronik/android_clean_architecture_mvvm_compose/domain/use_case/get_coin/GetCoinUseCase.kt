package com.ronik.android_clean_architecture_mvvm_compose.domain.use_case.get_coin

import com.ronik.android_clean_architecture_mvvm_compose.common.Resource
import com.ronik.android_clean_architecture_mvvm_compose.data.remote.dto.toCoin
import com.ronik.android_clean_architecture_mvvm_compose.data.remote.dto.toCoinDetail
import com.ronik.android_clean_architecture_mvvm_compose.domain.model.Coin
import com.ronik.android_clean_architecture_mvvm_compose.domain.model.CoinDetail
import com.ronik.android_clean_architecture_mvvm_compose.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
     operator fun invoke(coinId:String):Flow<Resource<CoinDetail>> = flow {
          try {
              emit(Resource.Loading())
              val coin=repository.getCoinById(coinId = coinId).toCoinDetail()
              emit(Resource.Success(data = coin))
          } catch (e: HttpException) {
              emit(Resource.Error(message = e.localizedMessage?:"An unexpected error occured"))
          } catch (e: IOException) {
              emit(Resource.Error(message ="Couldn't reach server. Check your internet connection"))
          }
     }
}