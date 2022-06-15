package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemShopEditorSubcontentBinding

class ShopEditorSubContentRVAdapter(private val shopEditorSubContentList:ArrayList<ShopEditorSubContent>):RecyclerView.Adapter<ShopEditorSubContentRVAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemShopEditorSubcontentBinding = ItemShopEditorSubcontentBinding.inflate(LayoutInflater.from(viewGroup.context),viewGroup,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(shopEditorSubContentList[position])
    }

    override fun getItemCount(): Int = shopEditorSubContentList.size


    inner class ViewHolder(val binding: ItemShopEditorSubcontentBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(subcontent : ShopEditorSubContent){
            binding.itemShopEditorSubcontentName.text = subcontent.name
            binding.itemShopEditorSubcontentCompany.text = subcontent.company
            binding.itemShopEditorSubcontentImg.setImageResource(subcontent.img!!)
        }
    }
}