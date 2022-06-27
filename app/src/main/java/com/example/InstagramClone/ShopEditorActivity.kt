package com.example.InstagramClone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.InstagramClone.databinding.ActivityShopEditorBinding

class ShopEditorActivity : AppCompatActivity() {
    lateinit var binding: ActivityShopEditorBinding
    private var editorDatas = ArrayList<ShopEditor>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopEditorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shopEditorBackIv.setOnClickListener {
            finish()
        }

        binding.shopEditorWishlistIv.setOnClickListener {
            val intent = Intent(this, ShopWishlistActivity::class.java)
            startActivity(intent)
        }

        editorDatas.apply {
            add(
                ShopEditor(
                    "#SneakerSaturday",
                    R.drawable.shop_content1,
                    "shop",
                    R.drawable.shop_content8,
                    "제품 30개",
                    "Just in:editors' style picks",
                    arrayListOf(
                        ShopEditorSubContent(
                            "Crochet Wave Hat",
                            "fwrd",
                            R.drawable.shop_content7
                        ),
                        ShopEditorSubContent(
                            "The Beach Sunglasses",
                            "hm",
                            R.drawable.shop_content6
                        ),
                        ShopEditorSubContent(
                            "Crochet Wave Hat",
                            "fwrd",
                            R.drawable.shop_content7
                        ),
                        ShopEditorSubContent(
                            "The Beach Sunglasses",
                            "hm",
                            R.drawable.shop_content6
                        )
                    )
                )
            )

            add(
                ShopEditor(
                    "#Sunny-day Skincare",
                    R.drawable.shop_content4,
                    "shop",
                    R.drawable.shop_content5,
                    "제품 31개",
                    "Men's summer style",
                    arrayListOf(
                        ShopEditorSubContent(
                            "Jackson Shorts",
                            "onsclothing",
                            R.drawable.shop_content6
                        ),
                        ShopEditorSubContent(
                            "Cargo Tote Bag",
                            "tombogo",
                            R.drawable.shop_content7
                        ),
                        ShopEditorSubContent(
                            "Crochet Wave Hat",
                            "fwrd",
                            R.drawable.shop_content7
                        ),
                        ShopEditorSubContent(
                            "The Beach Sunglasses",
                            "hm",
                            R.drawable.shop_content6
                        )
                    )
                )
            )
        }


        val shopEditorRVAdapter = ShopEditorRVAdapter(editorDatas)
        binding.shopEditorSubcontentRv.adapter = shopEditorRVAdapter
        binding.shopEditorSubcontentRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

    }
}