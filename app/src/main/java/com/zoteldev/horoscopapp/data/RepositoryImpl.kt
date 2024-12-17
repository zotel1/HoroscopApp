package com.zoteldev.horoscopapp.data

import android.util.Log
import com.zoteldev.horoscopapp.data.network.HoroscopeApiService
import com.zoteldev.horoscopapp.data.network.response.PredictionResponse
import com.zoteldev.horoscopapp.domain.Repository
import com.zoteldev.horoscopapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) :Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        //Llamamos a Retrofit
        kotlin.runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("prim", "Ha ocurrido un error ${it.message}") }
        return null
    }
}