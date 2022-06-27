package com.example.InstagramClone

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemDmChattingBinding

class ChattingRVAdapter(private val chattinglist:ArrayList<Chatting>):RecyclerView.Adapter<ChattingRVAdapter.ViewHolder>() {

    interface MyItemClickListener{
        fun onItemClick(chatting: Chatting)
    }

    private lateinit var mItemClickListener: MyItemClickListener
    fun setMyItemClickListener(itemClickListener: MyItemClickListener){
        mItemClickListener = itemClickListener
    }

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): ChattingRVAdapter.ViewHolder {
        val binding : ItemDmChattingBinding = ItemDmChattingBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChattingRVAdapter.ViewHolder, position: Int) {
        holder.bind(chattinglist[position])
        holder.itemView.setOnClickListener {
            mItemClickListener.onItemClick(chattinglist[position])
        }
    }

    override fun getItemCount(): Int = chattinglist.size

    inner class ViewHolder(val binding: ItemDmChattingBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(chatting : Chatting){
            binding.chattingUserNameTv.text = chatting.name
            binding.chattingUserImgIv.setImageResource(chatting.img!!)
            binding.chattingTimeTv.text = chatting.time
        }
    }

}