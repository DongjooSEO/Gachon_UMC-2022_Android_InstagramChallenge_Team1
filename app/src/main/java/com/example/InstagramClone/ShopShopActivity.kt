package com.example.InstagramClone

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.InstagramClone.databinding.ActivityShopShopBinding

class ShopShopActivity : AppCompatActivity() {
    lateinit var binding: ActivityShopShopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shopShopBackIv.setOnClickListener {
            finish()
        }
    }
}