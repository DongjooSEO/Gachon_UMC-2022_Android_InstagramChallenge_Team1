package com.example.InstagramClone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import com.example.InstagramClone.databinding.FragmentSignupCallBinding

class SignupCallFragment : Fragment(){
    lateinit var binding : FragmentSignupCallBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        binding = FragmentSignupCallBinding.inflate(inflater, container, false)

        return binding.root
    }
}