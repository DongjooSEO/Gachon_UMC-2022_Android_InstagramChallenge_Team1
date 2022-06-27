package com.example.InstagramClone

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.InstagramClone.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    private var homeStoryDatas = ArrayList<HomeStory>()
    private var homePostDatas = ArrayList<HomePost>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.sendMessageIv.setOnClickListener {
            activity?.let {
                val intent = Intent(context, HomeDmActivity::class.java)
                startActivity(intent)
            }
        }


        homeStoryDatas.apply {
            add(
                HomeStory(
                    false,
                    false,
                    R.drawable.shop_content2,
                    "내 스토리"
                )
            )
            add(
                HomeStory(
                    false,
                    false,
                    R.drawable.shop_content1,
                    "aaaaa"
                )
            )
            add(
                HomeStory(
                    false,
                    false,
                    R.drawable.shop_content3,
                    "bbbbb"
                )
            )
            add(
                HomeStory(
                    false,
                    false,
                    R.drawable.shop_content4,
                    "ccccc"
                )
            )
        }

        val homeStoryRVAdapter = HomeStroyRVAdapter(homeStoryDatas)
        binding.storyListRv.adapter = homeStoryRVAdapter
        binding.storyListRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)

        homeStoryRVAdapter.setMyItemClickListener(object : HomeStroyRVAdapter.MyItemClickListener{
            override fun onItemClick(story: HomeStory) {
                activity?.let {
                    val intent = Intent(context, StoryActivity::class.java)
                    startActivity(intent)
                }
            }
        })

        homePostDatas.apply {
            add(
                HomePost(
                    R.drawable.shop_content2,
                    "aaaaa",
                    R.drawable.img_album_exp,
                    "7개 좋아요",
                    "abcdefg"
                )
            )
            add(
                HomePost(
                    R.drawable.shop_content3,
                    "aaaaa",
                    R.drawable.img_album_exp2,
                    "7개 좋아요",
                    "abcdefg"
                )
            )
            add(
                HomePost(
                    R.drawable.shop_content4,
                    "aaaaa",
                    R.drawable.img_album_exp3,
                    "7개 좋아요",
                    "abcdefg"
                )
            )
            add(
                HomePost(
                    R.drawable.shop_content5,
                    "aaaaa",
                    R.drawable.img_album_exp4,
                    "7개 좋아요",
                    "abcdefg"
                )
            )
        }


        val homePostRVAdapter = HomePostRVAdapter(homePostDatas)
        binding.postListRv.adapter = homePostRVAdapter
        binding.postListRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)

        return binding.root
    }
}