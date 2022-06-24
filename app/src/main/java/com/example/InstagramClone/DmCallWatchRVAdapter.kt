package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemDmCallWatchBinding

class DmCallWatchRVAdapter(private val watchlist:ArrayList<DmCallWatch>):RecyclerView.Adapter<DmCallWatchRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): DmCallWatchRVAdapter.ViewHolder {
        val binding: ItemDmCallWatchBinding = ItemDmCallWatchBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DmCallWatchRVAdapter.ViewHolder, position: Int) {
        holder.bind(watchlist[position])
    }

    override fun getItemCount(): Int = watchlist.size

    inner class ViewHolder(val binding: ItemDmCallWatchBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(watch:DmCallWatch){
            binding.itemWatchImgIv.setImageResource(watch.img!!)
        }
    }
}