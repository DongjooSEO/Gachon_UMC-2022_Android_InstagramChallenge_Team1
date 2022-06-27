package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemShopEditorBinding
import com.example.InstagramClone.databinding.ItemShopEditorSubcontentBinding

class ShopEditorRVAdapter(private val shopEditorList: ArrayList<ShopEditor>):RecyclerView.Adapter<ShopEditorRVAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemShopEditorBinding = ItemShopEditorBinding.inflate(LayoutInflater.from(viewGroup.context),viewGroup,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(shopEditorList[position])
    }

    override fun getItemCount(): Int = shopEditorList.size


    inner class ViewHolder(val binding: ItemShopEditorBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(editor : ShopEditor) {
            binding.itemShopEditorSeriesTitleTv.text = editor.title
            binding.itemShopEditorSeriesImgIv.setImageResource(editor.titleImg!!)
            binding.itemShopEditorSeriesUserTv.text = editor.user
            binding.itemShopEditorSeriesUserImgIv.setImageResource(editor.userImg!!)
            binding.itemShopEditorSeriesCountTv.text = editor.count

            binding.itemShopEditorSubcontentRv.apply {
                adapter = ShopEditorSubContentRVAdapter(editor.subcontent)
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

            }
        }

    }

}