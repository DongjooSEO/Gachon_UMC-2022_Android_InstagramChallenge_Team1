package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemChattingSearchRequestBinding

class ChattingSearchRequestRVAdapter(private val requestList:ArrayList<ChattingSearchRequest>):
    RecyclerView.Adapter<ChattingSearchRequestRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): ChattingSearchRequestRVAdapter.ViewHolder {
        val binding: ItemChattingSearchRequestBinding = ItemChattingSearchRequestBinding.inflate(
            LayoutInflater.from(viewGroup.context),viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ChattingSearchRequestRVAdapter.ViewHolder,
        position: Int
    ) {
        holder.bind(requestList[position])
    }

    override fun getItemCount(): Int = requestList.size

    inner class ViewHolder(val binding: ItemChattingSearchRequestBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(request:ChattingSearchRequest){
            binding.itemSearchRequestImg.setImageResource(request.img!!)
            binding.itemSearchRequestUserNameTv.text = request.name
            binding.itemSearchRequestUserIdTv.text = request.id
        }
    }
}