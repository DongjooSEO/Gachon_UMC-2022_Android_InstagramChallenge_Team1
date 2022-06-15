package com.example.InstagramClone

import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemShopspecialBinding

class ShopSpecialRVAdapter(private val shopSpecialList: ArrayList<ShopSpecial>): RecyclerView.Adapter<ShopSpecialRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemShopspecialBinding = ItemShopspecialBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(shopSpecialList[position])
    }

    override fun getItemCount(): Int = shopSpecialList.size


    inner class ViewHolder(val binding: ItemShopspecialBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(shopSpecial : ShopSpecial){
            binding.itemSpecialProductNameTv.text = shopSpecial.name
            binding.itemSpecialProductCompanyTv.text = shopSpecial.company
            binding.itemSpecialProductImgIv.setImageResource(shopSpecial.proudctImg!!)
            binding.itemSpecialProductCompanyIv.setImageResource(shopSpecial.companyImg!!)
        }
    }

}

