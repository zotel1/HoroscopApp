package com.zoteldev.horoscopapp.domain

import com.zoteldev.horoscopapp.data.network.response.PredictionResponse
import com.zoteldev.horoscopapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}