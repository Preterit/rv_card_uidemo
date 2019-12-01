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
                "http://b-ssl.duitang.com/uploads/item/201804/14/20180414174003_HtTWY.jpeg",
                "美女1"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "http://b-ssl.duitang.com/uploads/blog/201401/16/20140116161553_Mus5Z.jpeg",
                "美女2"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1575178755766&di=568d0124197a2347625bf6063c36e806&imgtype=0&src=http%3A%2F%2Fi0.hdslb.com%2Fbfs%2Farticle%2F7e2155b585a30f37a2d68af8b25590eae12ad5f9.jpg",
                "美女3"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "http://b-ssl.duitang.com/uploads/item/201508/10/20150810172701_QT5dk.jpeg",
                "美女4"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3692474013,25868374&fm=26&gp=0.jpg",
                "美女5"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1575178755952&di=2838c567d5a8f35f4a37b3a18889c46e&imgtype=0&src=http%3A%2F%2Fimage.namedq.com%2Fuploads%2F20181220%2F17%2F1545296990-nqGUCaNIpc.jpg",
                "美女6"
            )
        )
        datas.add(
            SwipeCardBean(
                i++,
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1575178755767&di=0804b1db19c6fa9fc497bff1d4c7a20f&imgtype=0&src=http%3A%2F%2Fimg3.duitang.com%2Fuploads%2Fitem%2F201605%2F20%2F20160520195534_FMQWa.thumb.700_0.jpeg",
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


