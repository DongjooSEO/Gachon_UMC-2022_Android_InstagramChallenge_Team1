package com.example.InstagramClone

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.InstagramClone.databinding.FragmentDmChattingBinding
import com.example.InstagramClone.databinding.ItemDmChattingBinding

class DmChattingFragment : Fragment() {
    lateinit var binding: FragmentDmChattingBinding
    private var chattingDatas = ArrayList<Chatting>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDmChattingBinding.inflate(inflater, container, false)

        binding.dmChattingSearchEt.setOnClickListener {
            activity?.let {
                val intent = Intent(context, ChattingSearchActivity::class.java)
                startActivity(intent)
            }
        }

        if(chattingDatas.isEmpty()){
            chattingDatas.apply {
                add(
                    Chatting(
                        "가나다",
                        R.drawable.img_album_exp,
                        "1시간 전에 읽음"
                    )
                )
                add(
                    Chatting(
                        "라마바",
                        R.drawable.img_album_exp,
                        "2시간 전에 읽음"
                    )
                )
                add(
                    Chatting(
                        "사아자",
                        R.drawable.img_album_exp,
                        "3시간 전에 읽음"
                    )
                )
                add(
                    Chatting(
                        "차카타",
                        R.drawable.img_album_exp,
                        "4시간 전에 읽음"
                    )
                )
                add(
                    Chatting(
                        "파하",
                        R.drawable.img_album_exp,
                        "5시간 전에 읽음"
                    )
                )
                add(
                    Chatting(
                        "아야어",
                        R.drawable.img_album_exp,
                        "6시간 전에 읽음"
                    )
                )
            }
        }
        else{
        }



        val chattingRVAdapter = ChattingRVAdapter(chattingDatas)
        binding.dmChatingListRv.adapter = chattingRVAdapter
        binding.dmChatingListRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


        chattingRVAdapter.setMyItemClickListener(object : ChattingRVAdapter.MyItemClickListener{
            override fun onItemClick(chatting: Chatting) {
                val intent = Intent(context as HomeDmActivity, DmActivity::class.java)
                startActivity(intent)
                //데이터 주고받아야 됨
            }

        })


        return binding.root
    }
}