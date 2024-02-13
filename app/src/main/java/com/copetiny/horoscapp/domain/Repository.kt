package com.copetiny.horoscapp.domain

import com.copetiny.horoscapp.data.network.response.PredictionResponse
import com.copetiny.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?

}