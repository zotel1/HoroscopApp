package com.zoteldev.horoscopapp.data.providers

import com.zoteldev.horoscopapp.domain.model.HoroscopeInfo
import com.zoteldev.horoscopapp.domain.model.HoroscopeInfo.*

class HoroscopeProvider {
    fun getHoroscopes():List<HoroscopeInfo>{
        return listOf(
            Aries, Taurus, Gemini,
            Leo, Libra, Virgo,
            Scorpio, Sagittarius, Capricorn,
            Aquarius, Cancer, Pisces
        )
    }
}