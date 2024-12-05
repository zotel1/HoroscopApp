package com.zoteldev.horoscopapp.domain.model

import com.zoteldev.horoscopapp.R

sealed class HoroscopeInfo(  val img: Int, val nane: Int) {
    object Aries: HoroscopeInfo(R.drawable.aries, R.string.app_name)
}