package com.example.InstagramClone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.example.InstagramClone.databinding.FragmentMypageBinding
import com.google.android.material.tabs.TabLayoutMediator

class MyPageFragment : Fragment() {
    lateinit var binding: FragmentMypageBinding
    private val mypageTabArray = arrayListOf(R.drawable.ic_posts, R.drawable.ic_tagged)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(inflater, container, false)

        val mypageAdapter = MypageVPAdapter(this)
        binding.mypageVp.adapter = mypageAdapter

        TabLayoutMediator(binding.mypageTab, binding.mypageVp){
                tab, position ->
            tab.setIcon(mypageTabArray[position])
        }.attach()


        return binding.root
    }

}