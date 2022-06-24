package com.example.InstagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemDmCallToFriendsBinding

class DmCallToFriendsRVAdapter(private val friendslist:ArrayList<DmCallToFriends>): RecyclerView.Adapter<DmCallToFriendsRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): DmCallToFriendsRVAdapter.ViewHolder {
        val binding: ItemDmCallToFriendsBinding = ItemDmCallToFriendsBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DmCallToFriendsRVAdapter.ViewHolder, position: Int) {
        holder.bind(friendslist[position])
    }

    override fun getItemCount(): Int = friendslist.size

    inner class ViewHolder(val binding: ItemDmCallToFriendsBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(friend:DmCallToFriends){
            binding.itemToFriendsNameTv.text = friend.name
            binding.itemToFriendsIdTv.text = friend.id
            binding.itemToFriendsImgCiv.setImageResource(friend.img!!)
        }
    }
}