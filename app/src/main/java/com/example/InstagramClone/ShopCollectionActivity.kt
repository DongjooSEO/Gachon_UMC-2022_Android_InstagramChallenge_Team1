package com.example.InstagramClone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.InstagramClone.databinding.ActivityShopCollectionBinding
import com.example.InstagramClone.databinding.ItemShopCollectionBinding

class ShopCollectionActivity:AppCompatActivity() {
    lateinit var binding: ActivityShopCollectionBinding
    private var collectionDatas = ArrayList<ShopCollection>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopCollectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shopCollectionBackIv.setOnClickListener {
            finish()
        }

        binding.shopCollectionWishlistIv.setOnClickListener {
            val intent = Intent(this, ShopWishlistActivity::class.java)
            startActivity(intent)
        }

        collectionDatas.apply {
            add(
                ShopCollection(
                    "반가워, 케어베어",
                    R.drawable.shop_content1,
                    "kakaofriends_official",
                    R.drawable.shop_content2,
                    "제품 2개"
                )
            )

            add(
                ShopCollection(
                    "Outwears",
                    R.drawable.shop_content3,
                    "official",
                    R.drawable.shop_content4,
                    "제품 3개"
                )
            )

            add(
                ShopCollection(
                    "New Arrivals",
                    R.drawable.shop_content5,
                    "friends_official",
                    R.drawable.shop_content6,
                    "제품 5개"
                )
            )
        }

        val shopCollectionRVAdapter = ShopCollectionRVAdapter(collectionDatas)
        binding.shopEditorSubcontentRv.adapter = shopCollectionRVAdapter
        binding.shopEditorSubcontentRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}