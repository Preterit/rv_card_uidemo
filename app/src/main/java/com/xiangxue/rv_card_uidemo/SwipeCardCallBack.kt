package com.xiangxue.rv_card_uidemo

import android.graphics.Canvas
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.xiangxue.rv_card_uidemo.adapter.UniversalAdapter

/**
 * Date:2019-11-27
 * author:lwb
 * Desc:
 */
class SwipeCardCallBack(
    _adapter: UniversalAdapter<SwipeCardBean>,
    _mDatas: ArrayList<SwipeCardBean>
) :
    ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.UP or ItemTouchHelper.DOWN or ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {

    var adapter = _adapter
    var mData = _mDatas


    /**
     * item 滑出去的回掉
     */
    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        val remove = mData.removeAt(viewHolder.layoutPosition)
        mData.add(0, remove)  // 放到第一个
        adapter.notifyDataSetChanged()

    }

    /**
     * 动画
     */
    override fun onChildDraw(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)

        var maxDistance = (recyclerView.width * 0.5f).toDouble()   // 滑动的极限值
        var distance = Math.sqrt((dX * dX + dY * dY).toDouble())   // 对角线长度
        var fraction = distance / maxDistance


        if (fraction > 1) {
            fraction = 1.0
        }

        //显示的个数
        val childCount = recyclerView.childCount
        for (index in 0 until childCount) {
            val view = recyclerView.getChildAt(index)

            var level = childCount - index - 1

            if (level > 0) {
                if (level < CardConfig.MAX_SHOW_COUNT - 1) {
                    view.translationY = (CardConfig.TRANS_Y_GAP * level - fraction * CardConfig.TRANS_Y_GAP).toFloat()
                    view.scaleX = (1 - CardConfig.SCALE_GAP * level + fraction * CardConfig.SCALE_GAP).toFloat()
                    view.scaleY = (1 - CardConfig.SCALE_GAP * level + fraction * CardConfig.SCALE_GAP).toFloat()
                }
            }

        }

    }

    /**
     * 滑动区域
     */
    override fun getSwipeThreshold(viewHolder: RecyclerView.ViewHolder): Float {
        return 0.2.toFloat()
    }

    /**
     * drag 拖动
     */
    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }
}