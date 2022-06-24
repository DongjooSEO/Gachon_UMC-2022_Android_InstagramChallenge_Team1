package com.example.InstagramClone

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.InstagramClone.databinding.FragmentShopBinding

class ShopFragment : Fragment() {
    lateinit var binding: FragmentShopBinding
    private var shop1Datas = ArrayList<Shop>()
    private var shop1SpecialDatas = ArrayList<ShopSpecial>()
    private var shop2Datas = ArrayList<Shop>()
    private var shop2SpecialDatas = ArrayList<ShopSpecial>()
    private var shop3Datas = ArrayList<Shop>()
    private var shop3SpecialDatas = ArrayList<ShopSpecial>()

    private var shopDatasAll = ArrayList<Shop>()
    lateinit var adapter: ShopDataAllRVAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShopBinding.inflate(inflater, container, false)

        binding.shopSearchEt.setOnClickListener {
            activity?.let {
                val intent = Intent(context, ShopSearchActivity::class.java)
                startActivity(intent)
            }
        }

        binding.shopCategoryShop.setOnClickListener {
            activity?.let {
                val intent = Intent(context, ShopShopActivity::class.java)
                startActivity(intent)
            }
        }

        binding.shopCategoryVideo.setOnClickListener {
            activity?.let {
                val intent = Intent(context, ShopVideoActivity::class.java)
                startActivity(intent)
            }
        }

        binding.shopWishlistIv.setOnClickListener {
            activity?.let {
                val intent = Intent(context, ShopWishlistActivity::class.java)
                startActivity(intent)
            }
        }

        binding.shopCategoryEditor.setOnClickListener {
            activity?.let {
                val intent = Intent(context, ShopEditorActivity::class.java)
                startActivity(intent)
            }
        }

        binding.shopCategoryCollections.setOnClickListener {
            activity?.let {
                val intent = Intent(context, ShopCollectionActivity::class.java)
                startActivity(intent)
            }
        }

        binding.shopCategoryGuide.setOnClickListener {
            activity?.let {
                val intent = Intent(context, ShopGuideActivity::class.java)
                startActivity(intent)
            }
        }


        shop1Datas.apply {
            add(Shop(R.drawable.shop_content1))
            add(Shop(R.drawable.shop_content2))
            add(Shop(R.drawable.shop_content3))
            add(Shop(R.drawable.shop_content4))
            add(Shop(R.drawable.shop_content5))
            add(Shop(R.drawable.shop_content6))
            add(Shop(R.drawable.shop_content7))
            add(Shop(R.drawable.shop_content8))
        }

        val shopRVAdapter = ShopRVAdapter(shop1Datas)
        binding.shopContentData1Rv.adapter = shopRVAdapter
        binding.shopContentData1Rv.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)

        val x = (resources.displayMetrics.density * 3).toInt()
        binding.shopContentData1Rv.addItemDecoration(GridSpacingItemDecoration(x))


        shop1SpecialDatas.apply {
            add(
                ShopSpecial(
                    "Lovely Kitty_curved mug",
                    "studihome__",
                    R.drawable.shop_content8,
                    R.drawable.shop_content1
                )
            )
            add(
                ShopSpecial(
                    "[낼나베이직]애플펜슬 펜촉 라이트(3개입)",
                    "nelna.shop",
                    R.drawable.shop_content7,
                    R.drawable.shop_content2
                )
            )
            add(
                ShopSpecial(
                    "palette_dawn sky",
                    "jongjong_2020",
                    R.drawable.shop_content6,
                    R.drawable.shop_content3
                )
            )
            add(
                ShopSpecial(
                    "극세사 소프트 담요_브라키오",
                    "joguman.store",
                    R.drawable.shop_content5,
                    R.drawable.shop_content4
                )
            )
            add(
                ShopSpecial(
                    "무지개구름 파우치",
                    "wittypixy",
                    R.drawable.shop_content4,
                    R.drawable.shop_content5
                )
            )
            add(
                ShopSpecial(
                    "루카랩후르츠홀리데이유리컵",
                    "your10x10",
                    R.drawable.shop_content3,
                    R.drawable.shop_content6
                )
            )
            add(
                ShopSpecial(
                    "크림 세이호",
                    "hozumipocket",
                    R.drawable.shop_content2,
                    R.drawable.shop_content7
                )
            )
            add(
                ShopSpecial(
                    "레이지 타이거 빅 에코백",
                    "muziktiger",
                    R.drawable.shop_content1,
                    R.drawable.shop_content8
                )
            )
            add(
                ShopSpecial(
                    "종이무드등키트",
                    "muds_museum.goods",
                    R.drawable.shop_content3,
                    R.drawable.shop_content4
                )
            )
        }

        val shopSpecialRVAdapter = ShopSpecialRVAdapter(shop1SpecialDatas)
        binding.shopContentData1SpecialInwishlistRv.adapter = shopSpecialRVAdapter
        binding.shopContentData1SpecialInwishlistRv.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val y = (resources.displayMetrics.density * 6).toInt()
        binding.shopContentData1SpecialInwishlistRv.addItemDecoration(
            HorizontalSpacingItemDecoration(y, 2 * y)
        )


        shop2Datas.apply {
            add(Shop(R.drawable.shop_content1))
            add(Shop(R.drawable.shop_content2))
            add(Shop(R.drawable.shop_content3))
            add(Shop(R.drawable.shop_content4))
            add(Shop(R.drawable.shop_content5))
            add(Shop(R.drawable.shop_content6))
            add(Shop(R.drawable.shop_content7))
            add(Shop(R.drawable.shop_content8))
        }

        val shop2RVAdapter = ShopRVAdapter(shop2Datas)
        binding.shopContentData2Rv.adapter = shop2RVAdapter
        binding.shopContentData2Rv.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)

        val z = (resources.displayMetrics.density * 3).toInt()
        binding.shopContentData2Rv.addItemDecoration(GridSpacingItemDecoration(z))


        shop2SpecialDatas.apply {
            add(
                ShopSpecial(
                    "Lovely Kitty_curved mug",
                    "studihome__",
                    R.drawable.shop_content8,
                    R.drawable.shop_content1
                )
            )
            add(
                ShopSpecial(
                    "[낼나베이직]애플펜슬 펜촉 라이트(3개입)",
                    "nelna.shop",
                    R.drawable.shop_content7,
                    R.drawable.shop_content2
                )
            )
            add(
                ShopSpecial(
                    "palette_dawn sky",
                    "jongjong_2020",
                    R.drawable.shop_content6,
                    R.drawable.shop_content3
                )
            )
            add(
                ShopSpecial(
                    "극세사 소프트 담요_브라키오",
                    "joguman.store",
                    R.drawable.shop_content5,
                    R.drawable.shop_content4
                )
            )
            add(
                ShopSpecial(
                    "무지개구름 파우치",
                    "wittypixy",
                    R.drawable.shop_content4,
                    R.drawable.shop_content5
                )
            )
            add(
                ShopSpecial(
                    "루카랩후르츠홀리데이유리컵",
                    "your10x10",
                    R.drawable.shop_content3,
                    R.drawable.shop_content6
                )
            )
            add(
                ShopSpecial(
                    "크림 세이호",
                    "hozumipocket",
                    R.drawable.shop_content2,
                    R.drawable.shop_content7
                )
            )
            add(
                ShopSpecial(
                    "레이지 타이거 빅 에코백",
                    "muziktiger",
                    R.drawable.shop_content1,
                    R.drawable.shop_content8
                )
            )
            add(
                ShopSpecial(
                    "종이무드등키트",
                    "muds_museum.goods",
                    R.drawable.shop_content3,
                    R.drawable.shop_content4
                )
            )
        }

        val shop2SpecialRVAdapter = ShopSpecialRVAdapter(shop2SpecialDatas)
        binding.shopContentData2SpecialShopAgainRv.adapter = shop2SpecialRVAdapter
        binding.shopContentData2SpecialShopAgainRv.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val k = (resources.displayMetrics.density * 6).toInt()
        binding.shopContentData2SpecialShopAgainRv.addItemDecoration(
            HorizontalSpacingItemDecoration(k, 2 * k)
        )


        shop3Datas.apply {
            add(Shop(R.drawable.shop_content1))
            add(Shop(R.drawable.shop_content2))
            add(Shop(R.drawable.shop_content3))
            add(Shop(R.drawable.shop_content4))
            add(Shop(R.drawable.shop_content5))
            add(Shop(R.drawable.shop_content6))
            add(Shop(R.drawable.shop_content7))
            add(Shop(R.drawable.shop_content8))
        }

        val shop3RVAdapter = ShopRVAdapter(shop3Datas)
        binding.shopContentData3Rv.adapter = shop3RVAdapter
        binding.shopContentData3Rv.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)

        val q = (resources.displayMetrics.density * 3).toInt()
        binding.shopContentData3Rv.addItemDecoration(GridSpacingItemDecoration(q))


        shop3SpecialDatas.apply {
            add(
                ShopSpecial(
                    "Lovely Kitty_curved mug",
                    "studihome__",
                    R.drawable.shop_content8,
                    R.drawable.shop_content1
                )
            )
            add(
                ShopSpecial(
                    "[낼나베이직]애플펜슬 펜촉 라이트(3개입)",
                    "nelna.shop",
                    R.drawable.shop_content7,
                    R.drawable.shop_content2
                )
            )
            add(
                ShopSpecial(
                    "palette_dawn sky",
                    "jongjong_2020",
                    R.drawable.shop_content6,
                    R.drawable.shop_content3
                )
            )
            add(
                ShopSpecial(
                    "극세사 소프트 담요_브라키오",
                    "joguman.store",
                    R.drawable.shop_content5,
                    R.drawable.shop_content4
                )
            )
            add(
                ShopSpecial(
                    "무지개구름 파우치",
                    "wittypixy",
                    R.drawable.shop_content4,
                    R.drawable.shop_content5
                )
            )
            add(
                ShopSpecial(
                    "루카랩후르츠홀리데이유리컵",
                    "your10x10",
                    R.drawable.shop_content3,
                    R.drawable.shop_content6
                )
            )
            add(
                ShopSpecial(
                    "크림 세이호",
                    "hozumipocket",
                    R.drawable.shop_content2,
                    R.drawable.shop_content7
                )
            )
            add(
                ShopSpecial(
                    "레이지 타이거 빅 에코백",
                    "muziktiger",
                    R.drawable.shop_content1,
                    R.drawable.shop_content8
                )
            )
            add(
                ShopSpecial(
                    "종이무드등키트",
                    "muds_museum.goods",
                    R.drawable.shop_content3,
                    R.drawable.shop_content4
                )
            )
        }

        val shop3SpecialRVAdapter = ShopSpecialRVAdapter(shop3SpecialDatas)
        binding.shopContentData3SpecialShopAgainRv.adapter = shop3SpecialRVAdapter
        binding.shopContentData3SpecialShopAgainRv.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val w = (resources.displayMetrics.density * 6).toInt()
        binding.shopContentData3SpecialShopAgainRv.addItemDecoration(
            HorizontalSpacingItemDecoration(w, 2 * w)
        )


        shopDatasAll.apply {
            add(Shop(R.drawable.shop_content1))
            add(Shop(R.drawable.shop_content2))
            add(Shop(R.drawable.shop_content3))
            add(Shop(R.drawable.shop_content4))
            add(Shop(R.drawable.shop_content5))
            add(Shop(R.drawable.shop_content6))
            add(Shop(R.drawable.shop_content7))
            add(Shop(R.drawable.shop_content8))
        }

        val shopDataAllRVAdapter = ShopRVAdapter(shopDatasAll)
        binding.shopContentDataAllRv.adapter = shopDataAllRVAdapter
        binding.shopContentDataAllRv.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)

        val a = (resources.displayMetrics.density * 3).toInt()
        binding.shopContentDataAllRv.addItemDecoration(GridSpacingItemDecoration(a))


        return binding.root
    }
}
