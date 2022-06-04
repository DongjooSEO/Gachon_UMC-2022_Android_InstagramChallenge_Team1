package com.example.InstagramClone

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.*
import com.example.InstagramClone.Constant.VIEW_TYPE_ITEM
import com.example.InstagramClone.Constant.VIEW_TYPE_LOADING
import com.example.InstagramClone.databinding.FragmentShopBinding

class ShopFragment : Fragment() {
    lateinit var binding: FragmentShopBinding
    private var shopDatas = ArrayList<Shop>()
    private var shopSpecialDatas = ArrayList<ShopSpecial>()
    private var shopDatas2 = ArrayList<Shop>()
    private var shopAgainDatas = ArrayList<ShopSpecial>()

    private var shopDatasAll = ArrayList<Shop>()
    lateinit var loadMoreItemsCells: ArrayList<Shop>
    lateinit var adapter: ShopDataAllRVAdapter
    lateinit var scrollListener: RecyclerViewLoadMoreScroll
    lateinit var mLayoutManager:RecyclerView.LayoutManager


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

        binding.shopWishlistIv.setOnClickListener {
            activity?.let {
                val intent = Intent(context, ShopWishlistActivity::class.java)
                startActivity(intent)
            }
        }


        shopDatas.apply {
            add(Shop(R.drawable.shop_content1))
            add(Shop(R.drawable.shop_content2))
            add(Shop(R.drawable.shop_content3))
            add(Shop(R.drawable.shop_content4))
            add(Shop(R.drawable.shop_content5))
            add(Shop(R.drawable.shop_content6))
            add(Shop(R.drawable.shop_content7))
            add(Shop(R.drawable.shop_content8))
        }

        val shopRVAdapter = ShopRVAdapter(shopDatas)
        binding.shopContentData1Rv.adapter = shopRVAdapter
        binding.shopContentData1Rv.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)

        val x = (resources.displayMetrics.density * 3).toInt()
        binding.shopContentData1Rv.addItemDecoration(GridSpacingItemDecoration(x))


        shopSpecialDatas.apply {
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

        val shopSpecialRVAdapter = ShopSpecialRVAdapter(shopSpecialDatas)
        binding.shopContentData1SpecialInwishlistRv.adapter = shopSpecialRVAdapter
        binding.shopContentData1SpecialInwishlistRv.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val y = (resources.displayMetrics.density * 6).toInt()
        binding.shopContentData1SpecialInwishlistRv.addItemDecoration(
            HorizontalSpacingItemDecoration(y, 2 * y)
        )


        shopDatas2.apply {
            add(Shop(R.drawable.shop_content1))
            add(Shop(R.drawable.shop_content2))
            add(Shop(R.drawable.shop_content3))
            add(Shop(R.drawable.shop_content4))
            add(Shop(R.drawable.shop_content5))
            add(Shop(R.drawable.shop_content6))
            add(Shop(R.drawable.shop_content7))
            add(Shop(R.drawable.shop_content8))
        }

        val shop2RVAdapter = ShopRVAdapter(shopDatas2)
        binding.shopContentData2Rv.adapter = shopRVAdapter
        binding.shopContentData2Rv.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)

        val z = (resources.displayMetrics.density * 3).toInt()
        binding.shopContentData2Rv.addItemDecoration(GridSpacingItemDecoration(z))


        shopAgainDatas.apply {
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

        val shopAgainRVAdapter = ShopSpecialRVAdapter(shopAgainDatas)
        binding.shopContentData2SpecialShopAgainRv.adapter = shopSpecialRVAdapter
        binding.shopContentData2SpecialShopAgainRv.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val k = (resources.displayMetrics.density * 6).toInt()
        binding.shopContentData2SpecialShopAgainRv.addItemDecoration(
            HorizontalSpacingItemDecoration(
                k,
                2 * k
            )
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
        binding.shopContentDataAllRv.adapter = shopRVAdapter
        binding.shopContentDataAllRv.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)

        val a = (resources.displayMetrics.density * 3).toInt()
        binding.shopContentDataAllRv.addItemDecoration(GridSpacingItemDecoration(z))

//        adapter = ShopDataAllRVAdapter(shopDatasAll)
//        adapter.notifyDataSetChanged()
//        val shopDataAllRVAdapter = adapter
//
//        setRVLayoutManager()
//        setRVScrollListener()


        return binding.root
    }

//    private fun LoadMoreData(){
//        adapter.addLoadingView()
//        loadMoreItemsCells = ArrayList()
//
//        val start = adapter.getItemCount()
//        val end = start + 8
//
//        Handler().postDelayed({
//            for(i in start..end){
//                loadMoreItemsCells.add(Shop(R.drawable.shop_content1))
//            }
//
//            adapter.removeLoadingView()
//
//            adapter.addData(loadMoreItemsCells)
//            scrollListener.setLoaded()
//            binding.shopContentDataAllRv.post{
//                adapter.notifyDataSetChanged()
//            }
//
//        },3000)
//    }
//
//    private fun setRVLayoutManager() {
//        mLayoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
//        binding.shopContentDataAllRv.layoutManager = mLayoutManager
//        binding.shopContentDataAllRv.setHasFixedSize(true)
//        binding.shopContentDataAllRv.adapter = adapter
//        (mLayoutManager as GridLayoutManager).spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
//            override fun getSpanSize(position: Int): Int {
//                return when (adapter.getItemViewType(position)) {
//                    VIEW_TYPE_ITEM -> 1
//                    VIEW_TYPE_LOADING -> 3 //number of columns of the grid
//                    else -> -1
//                }
//            }
//        }
//    }
//
//    private fun setRVScrollListener() {
//        scrollListener = RecyclerViewLoadMoreScroll(mLayoutManager as GridLayoutManager)
//        scrollListener.setOnLoadMoreListener(object : OnLoadMoreListener {
//            override fun onLoadMore() {
//                LoadMoreData()
//            }
//        })
//
//        binding.shopContentDataAllRv.addOnScrollListener(scrollListener)
//    }
}
