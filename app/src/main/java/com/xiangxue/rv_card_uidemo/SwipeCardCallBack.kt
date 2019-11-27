package com.xiangxue.rv_card_uidemo

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.xiangxue.rv_card_uidemo.adapter.UniversalAdapter

/**
 * Date:2019-11-27
 * author:lwb
 * Desc:
 */
class SwipeCardCallBack(
    _rv: RecyclerView,
    _adapter: UniversalAdapter<SwipeCardBean>,
    _mDatas: ArrayList<SwipeCardBean>
) :
    ItemTouchHelper.Callback() {

    override fun getMovementFlags(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder): Int {
        var flag = ItemTouchHelper.UP or ItemTouchHelper.DOWN or ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        return flag
    }

    var rv = _rv
    var adapter = _adapter
    var mData = _mDatas


    /**
     * item 滑出去的回掉
     */
    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
       return false
    }
}