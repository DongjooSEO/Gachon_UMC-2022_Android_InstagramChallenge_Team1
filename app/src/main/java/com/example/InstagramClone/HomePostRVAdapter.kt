package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemPostBinding
import com.example.InstagramClone.databinding.ItemStoryBinding

class HomePostRVAdapter(private val homePostList:ArrayList<HomePost>): RecyclerView.Adapter<HomePostRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): HomePostRVAdapter.ViewHolder {
        val binding: ItemPostBinding = ItemPostBinding.inflate(LayoutInflater.from(viewGroup.context),viewGroup,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomePostRVAdapter.ViewHolder, position: Int) {
        holder.bind(homePostList[position])
    }

    override fun getItemCount(): Int = homePostList.size

    inner class ViewHolder(val binding: ItemPostBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(post:HomePost){
            binding.postUserPictureCiv.setImageResource(post.userImg!!)
            binding.postUserIdTv.text = post.userId
            binding.postPictureIv.setImageResource(post.postImg!!)
            binding.postLikeCountTv.text = post.likeCount
            binding.postContentTv.text = post.content
        }
    }

}