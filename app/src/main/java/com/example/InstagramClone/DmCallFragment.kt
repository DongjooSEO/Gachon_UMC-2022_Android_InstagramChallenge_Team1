package com.example.InstagramClone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.InstagramClone.databinding.FragmentDmCallBinding

class DmCallFragment : Fragment() {
    lateinit var binding: FragmentDmCallBinding
    private var watchDatas = ArrayList<DmCallWatch>()
    private var friendsDatas = ArrayList<DmCallToFriends>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDmCallBinding.inflate(inflater, container, false)

        if(watchDatas.isNotEmpty()){

        }
        else{
            watchDatas.apply {
                add(DmCallWatch(R.drawable.img_album_exp2))
                add(DmCallWatch(R.drawable.img_album_exp3))
                add(DmCallWatch(R.drawable.img_album_exp4))
                add(DmCallWatch(R.drawable.img_album_exp5))
                add(DmCallWatch(R.drawable.img_album_exp6))
                add(DmCallWatch(R.drawable.img_album_exp))
            }
        }


        val dmCallWatchRVAdapter = DmCallWatchRVAdapter(watchDatas)
        binding.dmCallWatchRv.adapter = dmCallWatchRVAdapter
        binding.dmCallWatchRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)


        if (friendsDatas.isNotEmpty()){
            
        }
        else {

            friendsDatas.apply {
                add(
                    DmCallToFriends(
                        "가나다",
                        "aaaaa",
                        R.drawable.img_album_exp3
                    )
                )
                add(
                    DmCallToFriends(
                        "라마바",
                        "bbbbb",
                        R.drawable.img_album_exp4
                    )
                )
                add(
                    DmCallToFriends(
                        "사아자",
                        "ccccc",
                        R.drawable.img_album_exp5
                    )
                )
                add(
                    DmCallToFriends(
                        "차카타",
                        "ddddd",
                        R.drawable.img_album_exp6
                    )
                )
                add(
                    DmCallToFriends(
                        "파하",
                        "eeeee",
                        R.drawable.img_album_exp
                    )
                )
                add(
                    DmCallToFriends(
                        "아야어",
                        "fffff",
                        R.drawable.img_album_exp2
                    )
                )
            }
        }

        val dmCallToFriendsRVAdapter = DmCallToFriendsRVAdapter(friendsDatas)
        binding.dmCallToFriendsRv.adapter = dmCallToFriendsRVAdapter
        binding.dmCallToFriendsRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


        return binding.root
    }
}