package com.xiangxue.rv_card_uidemo

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Date:2019-11-26
 * author:lwb
 * Desc:
 */
class SwipeCardLayoutManager : RecyclerView.LayoutManager() {

    override fun generateDefaultLayoutParams(): RecyclerView.LayoutParams {
        return RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onLayoutChildren(recycler: RecyclerView.Recycler?, state: RecyclerView.State?) {
//        super.onLayoutChildren(recycler, state)
        //回收/复用
        detachAndScrapAttachedViews(recycler!!)

        //8个
        var bottomPosition = 0
        // 0,1,2,3,4,5,6,7
        if (itemCount < CardConfig.MAX_SHOW_COUNT) {
            bottomPosition = 0
        } else {
            bottomPosition = itemCount - CardConfig.MAX_SHOW_COUNT
        }

        for (i in bottomPosition until itemCount) {
            //复用
            val view = recycler.getViewForPosition(i)

        }


    }

}