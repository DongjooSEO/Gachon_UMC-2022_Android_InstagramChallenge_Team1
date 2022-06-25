package com.example.InstagramClone

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.InstagramClone.databinding.ActivityStoryBinding

class StoryActivity: AppCompatActivity() {
    lateinit var binding: ActivityStoryBinding
    private var timer:Timer = Timer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        timer.start()

    }


    inner class Timer():Thread() {

        private var second : Int = 0
        private var mills:Float = 0f

        override fun run() {
            super.run()
            while(true){
                if(second >= 15){
                    finish()
                    break
                }
                else {

                    sleep(50)
                    mills += 50

                    runOnUiThread {
                        binding.storyProgressPb.progress = (mills).toInt()
                    }

                    if (mills % 1000 == 0f) {
                        second++
                        Log.d("TIMER",second.toString())
                    }
                }

            }
        }

    }
}