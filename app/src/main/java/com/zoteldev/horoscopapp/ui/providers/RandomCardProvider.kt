package com.zoteldev.horoscopapp.ui.providers

import com.zoteldev.horoscopapp.ui.model.LuckyModel
import javax.inject.Inject
import kotlin.random.Random

class RandomCardProvider @Inject constructor(){
    fun getLucky(): LuckyModel{
        when(Random.nextInt(0, 32)){

        }
    }
}