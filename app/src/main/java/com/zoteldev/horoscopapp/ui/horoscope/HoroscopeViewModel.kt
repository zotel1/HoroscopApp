package com.zoteldev.horoscopapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.zoteldev.horoscopapp.data.providers.HoroscopeProvider
import com.zoteldev.horoscopapp.domain.model.HoroscopeInfo
import com.zoteldev.horoscopapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(private val horoscopeProvider: HoroscopeProvider):ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        horoscopeProvider.getHoroscopes()
        _horoscope.value = listOf(
            Aries, Taurus, Gemini,
            Leo, Libra, Virgo,
            Scorpio, Sagittarius, Capricorn,
            Aquarius, Cancer, Pisces
        )
    }
}