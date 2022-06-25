package com.example.InstagramClone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.InstagramClone.databinding.ActivityShopCartBinding

class ShopCartActivity : AppCompatActivity() {
    lateinit var binding: ActivityShopCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopCartBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.shopCartBackIv.setOnClickListener {
            finish()
        }
    }
}