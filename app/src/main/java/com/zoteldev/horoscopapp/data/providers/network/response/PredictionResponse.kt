package com.zoteldev.horoscopapp.data.providers.network.response

import com.google.gson.annotations.SerializedName

data class PredictionResponse (
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("icon") val icon: String,
    @SerializedName("sign") val sign: String
    )