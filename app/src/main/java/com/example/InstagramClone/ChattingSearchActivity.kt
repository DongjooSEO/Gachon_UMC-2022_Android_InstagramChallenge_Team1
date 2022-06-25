package com.example.InstagramClone

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.InstagramClone.databinding.ActivityChattingSearchBinding

class ChattingSearchActivity : AppCompatActivity() {
    lateinit var binding: ActivityChattingSearchBinding
    private var currentDatas = ArrayList<ChattingSearchCurrent>()
    private var requestDatas = ArrayList<ChattingSearchRequest>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChattingSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)

        binding.chattingSearchBackIv.setOnClickListener {
            imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY,0)
            finish()
        }


        currentDatas.apply {
            add(
                ChattingSearchCurrent(
                    "aaaaaa",
                    R.drawable.img_album_exp
                )
            )
            add(
                ChattingSearchCurrent(
                    "bbbbb",
                    R.drawable.img_album_exp2
                )
            )
            add(
                ChattingSearchCurrent(
                    "cccc",
                    R.drawable.img_album_exp3
                )
            )
        }

        val chattingSearchCurrentRVAdapter = ChattingSearchCurrentRVAdapter(currentDatas)
        binding.chattingSearchCurrentRv.adapter = chattingSearchCurrentRVAdapter
        binding.chattingSearchCurrentRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        requestDatas.apply {
            add(
                ChattingSearchRequest(
                    "가나다",
                    "aaaaaaaa",
                    R.drawable.img_album_exp2
                )
            )
            add(
                ChattingSearchRequest(
                    "라마바",
                    "bbbbb",
                    R.drawable.img_album_exp3
                )
            )
            add(
                ChattingSearchRequest(
                    "사아자",
                    "cccccc",
                    R.drawable.img_album_exp4
                )
            )
            add(
                ChattingSearchRequest(
                    "차카타",
                    "ddddddd",
                    R.drawable.img_album_exp5
                )
            )
        }

        val chattingSearchRequestRVAdapter = ChattingSearchRequestRVAdapter(requestDatas)
        binding.chattingSearchRequestRv.adapter = chattingSearchRequestRVAdapter
        binding.chattingSearchRequestRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }
}