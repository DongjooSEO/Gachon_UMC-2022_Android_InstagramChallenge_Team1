package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemShopCollectionBinding

class ShopCollectionRVAdapter(private val shopCollectionList:ArrayList<ShopCollection>):
    RecyclerView.Adapter<ShopCollectionRVAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemShopCollectionBinding = ItemShopCollectionBinding.inflate(
            LayoutInflater.from(viewGroup.context),viewGroup,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(shopCollectionList[position])
    }

    override fun getItemCount(): Int = shopCollectionList.size


    inner class ViewHolder(val binding: ItemShopCollectionBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(collection : ShopCollection){
            binding.itemShopCollectionTitleTv.text = collection.title
            binding.itemShopCollectionImgIv.setImageResource(collection.titleImg!!)
            binding.itemShopCollectionUserTv.text = collection.user
            binding.itemShopCollectionUserImgIv.setImageResource(collection.userImg!!)
            binding.itemShopCollectionCountTv.text = collection.count
        }
    }
}