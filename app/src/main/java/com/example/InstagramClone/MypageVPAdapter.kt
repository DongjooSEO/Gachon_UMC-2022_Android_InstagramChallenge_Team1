package com.example.InstagramClone

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MypageVPAdapter (fragment : Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int  = 2
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MypagePostsFragment()
            else -> MypageTaggedFragment()
        }
    }
}