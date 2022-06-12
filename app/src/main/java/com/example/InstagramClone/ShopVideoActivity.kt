package com.example.InstagramClone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.InstagramClone.databinding.ActivityShopVideoBinding

class ShopVideoActivity : AppCompatActivity() {
    lateinit var binding: ActivityShopVideoBinding
    private var videoDatas = ArrayList<ShopVideo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shopVideoBackIv.setOnClickListener {
            finish()
        }

        binding.shopVideoWishlistIv.setOnClickListener {
            val intent = Intent(this, ShopWishlistActivity::class.java)
            startActivity(intent)
        }

        videoDatas.apply {
            add(
                ShopVideo(
                    R.drawable.shop_content1,
                    "user0",
                    "조회 0회"
                )
            )
            add(
                ShopVideo(
                    R.drawable.shop_content1,
                    "user1",
                    "조회 1회"
                )
            )
            add(
                ShopVideo(
                    R.drawable.shop_content2,
                    "user2",
                    "조회 3회"
                )
            )
            add(
                ShopVideo(
                    R.drawable.shop_content1,
                    "user0",
                    "조회 0회"
                )
            )
            add(
                ShopVideo(
                    R.drawable.shop_content1,
                    "user0",
                    "조회 0회"
                )
            )
            add(
                ShopVideo(
                    R.drawable.shop_content1,
                    "user0",
                    "조회 0회"
                )
            )
            add(
                ShopVideo(
                    R.drawable.shop_content1,
                    "user0",
                    "조회 0회"
                )
            )
            add(
                ShopVideo(
                    R.drawable.shop_content1,
                    "user0",
                    "조회 0회"
                )
            )
        }

        val shopVideoRVAdapter = ShopVideoRVAdapter(videoDatas)
        binding.shopVideoVideosRv.adapter = shopVideoRVAdapter
        binding.shopVideoVideosRv.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

        val x = (resources.displayMetrics.density * 3).toInt()
        binding.shopVideoVideosRv.addItemDecoration(GridSpacingItemDecoration(x))

    }
}