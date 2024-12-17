package com.zoteldev.horoscopapp.domain

import com.zoteldev.horoscopapp.data.network.response.PredictionResponse

interface Repository {
    suspend fun getPrediction(sign:String): PredictionResponse?
}