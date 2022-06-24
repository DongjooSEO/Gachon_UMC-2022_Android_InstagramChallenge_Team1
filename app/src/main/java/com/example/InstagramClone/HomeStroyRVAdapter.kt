package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemStoryBinding

class HomeStroyRVAdapter(private val homeStoryList:ArrayList<HomeStory>):RecyclerView.Adapter<HomeStroyRVAdapter.ViewHolder>() {

    interface MyItemClickListener{
        fun onItemClick(story: HomeStory)
    }

    private lateinit var mItemClickListener : MyItemClickListener
    fun setMyItemClickListener(itemClickListener:MyItemClickListener){
        mItemClickListener = itemClickListener
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): HomeStroyRVAdapter.ViewHolder {
        val binding: ItemStoryBinding = ItemStoryBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeStroyRVAdapter.ViewHolder, position: Int) {
        holder.bind(homeStoryList[position])
        holder.itemView.setOnClickListener {
            mItemClickListener.onItemClick(homeStoryList[position])
        }
    }

    override fun getItemCount(): Int = homeStoryList.size

    inner class ViewHolder(val binding: ItemStoryBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(homeStory : HomeStory){
            binding.userStoryCiv.setImageResource(homeStory.profilImg!!)
            binding.userStoryIdTv.text = homeStory.id
        }
    }

}