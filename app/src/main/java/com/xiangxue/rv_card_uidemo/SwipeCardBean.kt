package com.xiangxue.rv_card_uidemo

import java.util.ArrayList

/**
 * Date:2019-11-26
 * author:lwb
 * Desc:
 */
class SwipeCardBean {

    var position: Int = 0
    var name: String = ""
    var url: String = ""

    constructor(position: Int, url: String, name: String) {
        this.position = position
        this.name = name
        this.url = url
    }

    constructor()

    fun getDatas(): ArrayList<SwipeCardBean> {
        var datas = ArrayList<SwipeCardBean>()
        var i = 1
        datas.add(
            SwipeCardBean(
                i++,
                "http://img5q.duitang.com/uploads/item/201505/04/20150504155117_8i4Rk.thumb.700_0.jpeg",
                "美女1"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "http://cdnq.duitang.com/uploads/item/201505/04/20150504155014_irFvu.thumb.700_0.jpeg",
                "美女2"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "http://img5q.duitang.com/uploads/item/201309/17/20130917032356_hdGjF.thumb.700_0.jpeg",
                "美女3"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "http://img5q.duitang.com/uploads/item/201505/04/20150504155137_JWcRK.thumb.700_0.jpeg",
                "美女4"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "http://img5q.duitang.com/uploads/item/201505/04/20150504155036_zNrPT.thumb.700_0.jpeg",
                "美女5"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "http://img5q.duitang.com/uploads/item/201504/26/201504262026_weMcT.thumb.700_0.jpeg",
                "美女6"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1560164210849&di=c6ea3fdd3ec938600ddde9022f46033c&imgtype=0&src=http%3A%2F%2Fbbs-fd.zol-img.com.cn%2Ft_s800x5000%2Fg4%2FM09%2F00%2F07%2FCg-4WlJA9zCIPZ8PAAQWAhRW0ssAAMA8wD2hYAABBYa996.jpg",
                "美女7"
            )
        )
        datas.add(SwipeCardBean(i++, "http://imgq.duitang.com/uploads/item/201504/21/20150421H2323_uwdEs.jpeg", "美女8"))
        return datas
    }

    override fun toString(): String {
        return "SwipeCardBean(position=$position, name='$name', url='$url')"
    }
}


