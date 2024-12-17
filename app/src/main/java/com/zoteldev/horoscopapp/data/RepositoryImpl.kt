package com.zoteldev.horoscopapp.data

import android.util.Log
import com.zoteldev.horoscopapp.data.network.HoroscopeApiService
import com.zoteldev.horoscopapp.data.network.response.PredictionResponse
import com.zoteldev.horoscopapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) :Repository {

    override suspend fun getPrediction(sign: String): PredictionResponse? {
        //Llamamos a Retrofit
        kotlin.runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it }
            .onFailure { Log.i("prim", "Ha ocurrido un error ${it.message}") }
        return null
    }
}