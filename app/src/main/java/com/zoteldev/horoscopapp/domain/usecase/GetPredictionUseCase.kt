package com.zoteldev.horoscopapp.domain.usecase

import com.zoteldev.horoscopapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign:String) = repository.getPrediction(sign)
}