package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemChattingSearchCurrentBinding

class ChattingSearchCurrentRVAdapter(private val currentList:ArrayList<ChattingSearchCurrent>):RecyclerView.Adapter<ChattingSearchCurrentRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): ChattingSearchCurrentRVAdapter.ViewHolder {
        val binding: ItemChattingSearchCurrentBinding = ItemChattingSearchCurrentBinding.inflate(
            LayoutInflater.from(viewGroup.context),viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ChattingSearchCurrentRVAdapter.ViewHolder,
        position: Int
    ) {
        holder.bind(currentList[position])
    }

    override fun getItemCount(): Int = currentList.size

    inner class ViewHolder(val binding: ItemChattingSearchCurrentBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(current:ChattingSearchCurrent){
            binding.itemSearchCurrentUserImgIv.setImageResource(current.img!!)
            binding.itemSearchCurrentUserIdTv.text = current.id
        }
    }
}