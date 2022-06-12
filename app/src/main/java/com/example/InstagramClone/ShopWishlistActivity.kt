package com.example.InstagramClone

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.InstagramClone.databinding.ActivityShopWishlistBinding

class ShopWishlistActivity : AppCompatActivity() {
    lateinit var binding: ActivityShopWishlistBinding
    private var wishDatas = ArrayList<ShopWish>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopWishlistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shopWishlistBackIv.setOnClickListener {
            finish()
        }

        wishDatas.apply {
            add(
                ShopWish(
                    "Product1",
                    "Company1",
                     R.drawable.shop_content1,
                    "7,600",
                    false
                )
            )
            add(
                ShopWish(
                    "Product2",
                    "Company2",
                    R.drawable.shop_content2,
                    "7,700",
                    false
                )
            )
            add(
                ShopWish(
                    "Product3",
                    "Company3",
                    R.drawable.shop_content3,
                    "7,800",
                    false
                )
            )
            add(
                ShopWish(
                    "Product4",
                    "Company4",
                    R.drawable.shop_content4,
                    "7,400",
                    false
                )
            )
            add(
                ShopWish(
                    "Product5",
                    "Company5",
                    R.drawable.shop_content5,
                    "7,500",
                    false
                )
            )

        }

        val shopWishlistRVAdapter = ShopWishlistRVAdapter(wishDatas)
        binding.shopWishlistContentRv.adapter = shopWishlistRVAdapter
        binding.shopWishlistContentRv.layoutManager =
            GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

        val x = (resources.displayMetrics.density * 3).toInt()
        binding.shopWishlistContentRv.addItemDecoration(GridSpacingItemDecoration(x))

    }
}