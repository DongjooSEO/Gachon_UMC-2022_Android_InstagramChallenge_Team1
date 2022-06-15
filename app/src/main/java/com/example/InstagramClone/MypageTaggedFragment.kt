package com.example.InstagramClone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.InstagramClone.databinding.FragmentMypageTaggedBinding

class MypageTaggedFragment : Fragment() {

    lateinit var binding : FragmentMypageTaggedBinding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentMypageTaggedBinding.inflate(inflater, container, false)

        return binding.root
    }
}