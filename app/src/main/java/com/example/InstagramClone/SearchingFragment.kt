package com.example.InstagramClone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.InstagramClone.databinding.FragmentSearchingBinding

class SearchingFragment : AppCompatActivity() {

    lateinit var binding: FragmentSearchingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentSearchingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.searchingCancelTv.setOnClickListener {
            finish()
        }
    }
}