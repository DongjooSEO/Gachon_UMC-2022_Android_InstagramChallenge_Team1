package com.example.InstagramClone

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class GridSpacingItemDecoration(private val padding: Int): RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
//
//        outRect.top = padding
//        outRect.bottom = padding
//        outRect.left = padding
//        outRect.right = padding

        val position:Int = parent.getChildAdapterPosition(view)
        val column = position % 2


        outRect.left = column * padding/4
        outRect.right = padding - (column + 1) * padding / 2
        if(position >= 2){
            outRect.top = padding * 4
        }
    }


}