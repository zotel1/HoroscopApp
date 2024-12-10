package com.zoteldev.horoscopapp.ui.detail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zoteldev.horoscopapp.R
import com.zoteldev.horoscopapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class horoscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    // Esta es la segunda forma de definir el by, la primera esta en el HoroscopeFragment
    private val horoscopeDetailViewModel:HoroscopeDetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}