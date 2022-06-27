package com.example.InstagramClone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.InstagramClone.databinding.ActivityShopGuideBinding

class ShopGuideActivity : AppCompatActivity() {
    lateinit var binding: ActivityShopGuideBinding
    private var guideDatas = ArrayList<ShopGuide>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopGuideBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shopGuideBackIv.setOnClickListener {
            finish()
        }

        binding.shopGuideWishlistIv.setOnClickListener {
            val intent = Intent(this, ShopWishlistActivity::class.java)
            startActivity(intent)
        }

        guideDatas.apply {
            add(
                ShopGuide(
                    "title0",
                    R.drawable.shop_content7,
                    "user0",
                    R.drawable.shop_content2,
                    "제품 0개"
                )
            )

            add(
                ShopGuide(
                    "title1",
                    R.drawable.shop_content6,
                    "user1",
                    R.drawable.shop_content5,
                    "제품 1개"
                )
            )

            add(
                ShopGuide(
                    "title2",
                    R.drawable.shop_content3,
                    "user0",
                    R.drawable.shop_content4,
                    "제품 2개"
                )
            )

            add(
                ShopGuide(
                    "title1",
                    R.drawable.shop_content6,
                    "user1",
                    R.drawable.shop_content5,
                    "제품 1개"
                )
            )

            add(
                ShopGuide(
                    "title0",
                    R.drawable.shop_content7,
                    "user0",
                    R.drawable.shop_content2,
                    "제품 0개"
                )
            )

            add(
                ShopGuide(
                    "title1",
                    R.drawable.shop_content6,
                    "user1",
                    R.drawable.shop_content5,
                    "제품 1개"
                )
            )

            add(
                ShopGuide(
                    "title0",
                    R.drawable.shop_content7,
                    "user0",
                    R.drawable.shop_content2,
                    "제품 0개"
                )
            )

            add(
                ShopGuide(
                    "title1",
                    R.drawable.shop_content6,
                    "user1",
                    R.drawable.shop_content5,
                    "제품 1개"
                )
            )
        }

        val shopGuideRVAdapter = ShopGuideRVAdapter(guideDatas)
        binding.shopGuideContentRv.adapter = shopGuideRVAdapter
        binding.shopGuideContentRv.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

        val x = (resources.displayMetrics.density * 3).toInt()
        binding.shopGuideContentRv.addItemDecoration(GridSpacingItemDecoration(x))

    }
}