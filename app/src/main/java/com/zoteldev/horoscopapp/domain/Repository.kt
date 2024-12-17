package com.zoteldev.horoscopapp.domain

interface Repository {
    suspend fun getPrediction(sign:String)
}