package com.example.InstagramClone

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ActivityShopWishlistBinding
import com.example.InstagramClone.databinding.ItemShopWishlistBinding

class ShopWishlistRVAdapter(private val shopWishList: ArrayList<ShopWish>): RecyclerView.Adapter<ShopWishlistRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemShopWishlistBinding = ItemShopWishlistBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(shopWishList[position])
    }

    override fun getItemCount(): Int = shopWishList.size

    inner class ViewHolder(val binding: ItemShopWishlistBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(product : ShopWish){
            binding.itemWishlistProductTv.text = product.name
            binding.itemWishlistCompanyTv.text = product.company
            binding.itemWishlistImgIv.setImageResource(product.productImg!!)
            binding.itemWishlistPriceTv.text = product.price
            product.wish = false
        }
    }
}