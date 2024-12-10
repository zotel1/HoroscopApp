package com.zoteldev.horoscopapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.zoteldev.horoscopapp.databinding.ItemHoroscopeBinding
import com.zoteldev.horoscopapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view:View):RecyclerView.ViewHolder(view){

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit) {

        val context = binding.tvTitle.context

        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.nane)

        binding.parent.setOnClickListener {
            //Aca la nueva funcion lambda llama a la primer lambda creada
            startRotationAnimation(binding.ivHoroscope, newLambda = {onItemSelected(horoscopeInfo)})
            //   onItemSelected(horoscopeInfo) }

        }
    }

    private fun startRotationAnimation(view:View, newLambda:()-> Unit){
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            // Creamos una nueva funcion lambda
            withEndAction { newLambda() }
            start()
        }
    }
}