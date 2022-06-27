package com.example.InstagramClone

import android.content.Intent
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

        outline()

        binding.shopShopBackIv.setOnClickListener {
            finish()
        }

        binding.shopShopWishlistIv.setOnClickListener {
            val intent = Intent(this, ShopWishlistActivity::class.java)
            startActivity(intent)
        }
    }

    private fun outline(){

        binding.shopShopFollowingShop1Item1Iv.clipToOutline =true
        binding.shopShopFollowingShop1Item2Iv.clipToOutline =true
        binding.shopShopFollowingShop1Item3Iv.clipToOutline =true

        binding.shopShopFollowingShop2Item1Iv.clipToOutline =true
        binding.shopShopFollowingShop2Item2Iv.clipToOutline =true
        binding.shopShopFollowingShop2Item3Iv.clipToOutline =true


        binding.shopShopRecommendShop1Item1Iv.clipToOutline = true
        binding.shopShopRecommendShop1Item2Iv.clipToOutline = true
        binding.shopShopRecommendShop1Item3Iv.clipToOutline = true

        binding.shopShopRecommendShop2Item1Iv.clipToOutline = true
        binding.shopShopRecommendShop2Item2Iv.clipToOutline = true
        binding.shopShopRecommendShop2Item3Iv.clipToOutline = true

        binding.shopShopRecommendShop3Item1Iv.clipToOutline = true
        binding.shopShopRecommendShop3Item2Iv.clipToOutline = true
        binding.shopShopRecommendShop3Item3Iv.clipToOutline = true

        binding.shopShopRecommendShop4Item1Iv.clipToOutline = true
        binding.shopShopRecommendShop4Item2Iv.clipToOutline = true
        binding.shopShopRecommendShop4Item3Iv.clipToOutline = true
    }
}