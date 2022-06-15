package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ActivityShopVideoBinding
import com.example.InstagramClone.databinding.ItemShopVideoBinding

class ShopVideoRVAdapter(private val shopVideoList:ArrayList<ShopVideo>):RecyclerView.Adapter<ShopVideoRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemShopVideoBinding = ItemShopVideoBinding.inflate(LayoutInflater.from(viewGroup.context),viewGroup,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(shopVideoList[position])
    }

    override fun getItemCount(): Int = shopVideoList.size

    inner class ViewHolder(val binding: ItemShopVideoBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(video : ShopVideo){
            binding.itemShopVideoThumbnailIv.setImageResource(video.thumbnail!!)
            binding.itemShopVideoUserTv.text = video.user
            binding.itemShopVideoCountTv.text = video.count!!
        }
    }
}