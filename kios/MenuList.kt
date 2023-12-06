package com.example.kioskstudy

open class MenuList {

    var category = arrayListOf<String>("hamburger", "drink")

    var hamburger = arrayListOf(
        arrayListOf("더블비프미트칠리버거", 3800),
        arrayListOf("더블쿼터파운더치즈", 3800),
        arrayListOf("맥스파이시", 4800),
        arrayListOf("불고기버거", 3900),
        arrayListOf("빅맥", 4300)
    )

    var drink = arrayListOf(
        arrayListOf("코카콜라", 1500),
        arrayListOf("코카콜라제로", 1500),
        arrayListOf("스프라이트", 1500),
        arrayListOf("환타", 1500),
        arrayListOf("오렌지쥬스", 2000)
    )

    var categoryList = listOf(hamburger, drink)

    init {
    }
}


