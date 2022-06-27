package com.example.InstagramClone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.InstagramClone.databinding.ActivityDmBinding

class DmActivity : AppCompatActivity() {
    lateinit var binding: ActivityDmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dmBackIv.setOnClickListener {
            finish()
        }
    }

}