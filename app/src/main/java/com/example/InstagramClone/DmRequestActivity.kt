package com.example.InstagramClone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.InstagramClone.databinding.ActivityDmRequestBinding
import com.example.InstagramClone.databinding.ItemDmCallToFriendsBinding

class DmRequestActivity : AppCompatActivity() {
    lateinit var binding: ActivityDmRequestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDmRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dmRequestBackIv.setOnClickListener {
            finish()
        }
    }
}