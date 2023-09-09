package com.lenncode.kotlin_api_rest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lenncode.kotlin_api_rest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}