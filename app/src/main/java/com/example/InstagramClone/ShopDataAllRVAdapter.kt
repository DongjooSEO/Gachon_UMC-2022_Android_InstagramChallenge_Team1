package com.example.InstagramClone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramClone.databinding.ItemLoadingBinding
import com.example.InstagramClone.databinding.ItemShopBinding
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
import java.util.logging.Handler

class ShopDataAllRVAdapter(private var itemsCells: ArrayList<Shop>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var mcontext: Context

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    class LoadingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    fun addData(dataViews: ArrayList<Shop>){
        this.itemsCells.addAll(dataViews)
        notifyDataSetChanged()
    }

    fun getItemAtPosition(position: Int):Shop{
        return itemsCells[position]
    }

//    fun addLoadingView(){
//        Handler().post{
//            itemsCells.add(Shop(null))
//            notifyItemInserted(itemsCells.size - 1)
//        }
//    }

    fun removeLoadingView() {
        if (itemsCells.size != 0) {
            itemsCells.removeAt(itemsCells.size - 1)
            notifyItemRemoved(itemsCells.size)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding: ItemShopBinding = ItemShopBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        mcontext = parent.context
        return if (viewType == Constant.VIEW_TYPE_ITEM) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_shop, parent, false)
            ItemViewHolder(view)
        } else {
            val view = LayoutInflater.from(mcontext).inflate(R.layout.item_loading, parent, false)
            LoadingViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder.itemViewType == Constant.VIEW_TYPE_ITEM) {
            holder.itemView.setBackgroundResource(itemsCells[position].Img!!)
        }
    }

    override fun getItemCount(): Int {
        return itemsCells.size
    }

    override fun getItemViewType(position: Int): Int {
        return if(itemsCells[position]==null){
            Constant.VIEW_TYPE_LOADING
        } else{
            Constant.VIEW_TYPE_ITEM
        }
    }



}