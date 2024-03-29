package com.xiangxue.rv_card_uidemo

import android.content.Context
import android.util.TypedValue

/**
 * Date:2019-11-26
 * author:lwb
 * Desc:
 */
class CardConfig {
    companion object {
        //屏幕上最多同时显示几个Item
        var MAX_SHOW_COUNT: Int = 0

        //每一级Scale相差0.05f，translationY相差7dp左右
        var SCALE_GAP: Float = 0.toFloat()
        var TRANS_Y_GAP: Int = 0

        fun initConfig(context: Context) {
            MAX_SHOW_COUNT = 4
            SCALE_GAP = 0.05f
            TRANS_Y_GAP =
                TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 15f, context.resources.displayMetrics).toInt()
        }
    }
}