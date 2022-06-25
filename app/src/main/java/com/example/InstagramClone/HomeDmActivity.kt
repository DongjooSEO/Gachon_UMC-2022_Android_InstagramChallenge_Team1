package com.example.InstagramClone

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.TabHost
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.InstagramClone.databinding.ActivityHomeDmBinding
import com.google.android.material.tabs.TabLayout

class HomeDmActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeDmBinding

    private lateinit var tabLayout : TabLayout
    private lateinit var frameLayout: FrameLayout

    val chatting = DmChattingFragment()
    val call = DmCallFragment()
    private var current:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeDmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeDmBackIv.setOnClickListener {
            finish()
        }

        frameLayout = binding.homeDmFramelayoutFrm
        tabLayout = binding.homeDmTablayoutTb

        tabLayout.addTab(tabLayout.newTab().setText("채팅"))
        tabLayout.addTab(tabLayout.newTab().setText("통화"))
        tabLayout.addTab(tabLayout.newTab().setText("요청"))

        supportFragmentManager.beginTransaction().replace(R.id.home_dm_framelayout_frm, chatting).commitAllowingStateLoss()


        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab!!.position){
                    0 -> {
                        current = 0
                        Log.d("TabNum","0")
                        supportFragmentManager.beginTransaction().replace(R.id.home_dm_framelayout_frm, chatting).commitAllowingStateLoss()
                    }
                    1 -> {
                        current = 1
                        Log.d("TabNum","1")
                        supportFragmentManager.beginTransaction().replace(R.id.home_dm_framelayout_frm, call).commitAllowingStateLoss()
                    }
                    2 -> {

                        Log.d("TabNum","2")
                        val intent = Intent(this@HomeDmActivity, DmRequestActivity::class.java)
                        startActivity(intent)
                        tabLayout.selectTab(tabLayout.getTabAt(current))
                    }
                }
            }
        })



    }
}