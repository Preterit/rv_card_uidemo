package com.xiangxue.rv_card_uidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.xiangxue.rv_card_uidemo.adapter.UniversalAdapter
import com.xiangxue.rv_card_uidemo.adapter.ViewHolder

class MainActivity : AppCompatActivity() {

    private lateinit var rv: RecyclerView
    lateinit var adapter: UniversalAdapter<SwipeCardBean>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CardConfig.initConfig(this)
        var swipeCardBean = SwipeCardBean()
        val datas = swipeCardBean.getDatas()

        rv = findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager = SwipeCardLayoutManager()

        adapter = object : UniversalAdapter<SwipeCardBean>(this, datas, R.layout.item_swipe_card) {
            override fun convert(holder: ViewHolder?, item: SwipeCardBean?) {
                holder?.setText(R.id.tvName, item?.name)
                holder?.setText(R.id.tvPrecent, "" + item?.position + "/" + datas.size)
                var iv =holder?.getView<ImageView>(R.id.iv)
                if (iv != null) {
                    Glide.with(this@MainActivity)
                        .load(item?.url)
                        .into(iv)
                }
            }
        }
        rv.adapter = adapter

        val callBack = SwipeCardCallBack(rv,adapter,datas)
        val helper = ItemTouchHelper(callBack)
        helper.attachToRecyclerView(rv)

        for (data in datas) {

        }

    }
}
