package com.xiangxue.rv_card_uidemo

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.logging.Level

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
        var bottomPosition: Int
        // 0,1,2,3,4,5,6,7
        if (itemCount < CardConfig.MAX_SHOW_COUNT) {
            bottomPosition = 0
        } else {
            bottomPosition = itemCount - CardConfig.MAX_SHOW_COUNT   // 8 - 4 = 4
        }

        for (i in bottomPosition until itemCount) {
            //复用
            val view = recycler.getViewForPosition(i)
            addView(view)

            measureChildWithMargins(view, 0, 0)

            //求padding的总大小(剧中展示，算出边缘空白区域大小)
            val widthSpace = width - getDecoratedMeasuredWidth(view)
            val heightSpace = height - getDecoratedMeasuredHeight(view)

            //布局
            layoutDecoratedWithMargins(
                view,
                widthSpace / 2,
                heightSpace / 2,
                widthSpace / 2 + getDecoratedMeasuredWidth(view),
                heightSpace / 2 + getDecoratedMeasuredHeight(view)
            )

            var level = itemCount - i - 1
            // 8 - 4 -1 = 3
            // 8 - 5 -1 = 2
            // 8 - 6 -1 = 1
            // 8 - 7 -1 = 0
            if (level > 0) {
                if (level < CardConfig.MAX_SHOW_COUNT - 1) {
                    view.translationY = (CardConfig.TRANS_Y_GAP * level).toFloat()
                    view.scaleX = 1 - CardConfig.SCALE_GAP * level
                    view.scaleY = 1 - CardConfig.SCALE_GAP * level
                } else {
                    view.translationY = (CardConfig.TRANS_Y_GAP * (level - 1)).toFloat()
                    view.scaleX = CardConfig.SCALE_GAP * (level - 1)
                    view.scaleY = CardConfig.SCALE_GAP * (level - 1)
                }
            }
//            if (level == 0) {
//                view.translationY = (CardConfig.TRANS_Y_GAP * level).toFloat()
//                view.scaleX = 1 - CardConfig.SCALE_GAP * level
//                view.scaleY = 1 - CardConfig.SCALE_GAP * level
//            }
        }


    }

}