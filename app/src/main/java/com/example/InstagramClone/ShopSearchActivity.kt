package com.example.InstagramClone

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.example.InstagramClone.databinding.ActivityShopSearchBinding
import com.example.InstagramClone.databinding.ItemShopBinding

class ShopSearchActivity : AppCompatActivity() {

    lateinit var binding: ActivityShopSearchBinding
    var imm : InputMethodManager? = null


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityShopSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)

        binding.shopSearchBackIv.setOnClickListener {
            imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY,0)
            finish()
        }


    }

}