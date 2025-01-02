package com.example.lottie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lottie.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lvAnimation.setAnimationFromUrl("https://lottie.host/36c39f2f-843a-4de8-8ac4-7edaa493d7b2/jaUHgECdIb.lottie")
        binding.lvAnimation.playAnimation()
    }
}
