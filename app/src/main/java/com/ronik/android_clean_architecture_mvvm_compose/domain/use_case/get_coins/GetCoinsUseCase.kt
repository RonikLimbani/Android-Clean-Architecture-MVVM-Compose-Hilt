package com.ronik.android_clean_architecture_mvvm_compose.domain.use_case.get_coins

import com.ronik.android_clean_architecture_mvvm_compose.common.Resource
import com.ronik.android_clean_architecture_mvvm_compose.data.remote.dto.toCoin
import com.ronik.android_clean_architecture_mvvm_compose.domain.model.Coin
import com.ronik.android_clean_architecture_mvvm_compose.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
     operator fun invoke():Flow<Resource<List<Coin>>> = flow {
          try {
              emit(Resource.Loading())
              val coins=repository.getCoins().map { it.toCoin() }
              emit(Resource.Success(data = coins))
          } catch (e: HttpException) {
              emit(Resource.Error(message = e.localizedMessage?:"An unexpected error occured"))

          }catch (e: IOException) {
              emit(Resource.Error(message ="Couldn't reach server. Check your internet connection"))
          }
     }
}