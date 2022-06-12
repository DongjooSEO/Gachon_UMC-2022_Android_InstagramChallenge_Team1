package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemShopGuideBinding

class ShopGuideRVAdapter(private val shopGuideList:ArrayList<ShopGuide>): RecyclerView.Adapter<ShopGuideRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemShopGuideBinding = ItemShopGuideBinding.inflate(LayoutInflater.from(viewGroup.context),viewGroup,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(shopGuideList[position])
    }

    override fun getItemCount(): Int = shopGuideList.size

    inner class ViewHolder(val binding: ItemShopGuideBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(guide : ShopGuide){
            binding.itemShopGuideTitleTv.text = guide.title
            binding.itemShopGuideImgIv.setImageResource(guide.img!!)
            binding.itemShopGuideUserTv.text = guide.user
            binding.itemShopGuideUserImgIv.setImageResource(guide.userImg!!)
            binding.itemShopGuideCountTv.text = guide.count
        }
    }
}