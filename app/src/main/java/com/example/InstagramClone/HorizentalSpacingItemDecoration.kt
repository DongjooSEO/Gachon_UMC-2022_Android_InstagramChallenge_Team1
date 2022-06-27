package com.example.InstagramClone

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class HorizontalSpacingItemDecoration(private val spacing: Int, private val side:Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        outRect.right = spacing

        if(parent.getChildLayoutPosition(view) == 0){
            outRect.left = side
        }
        else if(parent.getChildLayoutPosition(view)==8){
            outRect.right = side
        }

    }
}