package com.example.kioskstudy


class Basket(menu:MenuList) {
    var menu = menu

    var categoryNum: Int? = 0
    var beverageOrder: Int? = 0
    var isOrderChange: Int? = 0

    var basket = mutableListOf<MutableList<Any>>()
    var basketCost = mutableListOf<MutableList<Any>>()


    init{
    }
    fun showCategory() {
        println("주문하시려는 음료의 카테고리를 설정해주세요")
        for (index in 0 until menu.category.count()) {
            print("${index + 1}. " + menu.category[index])
            print(" ")
        }
        println()
        
    }

  

    fun showBeverage() {
        println("다음은 ${menu.category[categoryNum!!-1]} 음료 목룍입니다")
        for (i in 0 until menu.categoryList[categoryNum!!-1].size - 1) {
            println("${i+1}. ${menu.categoryList[categoryNum!!-1][i][0]}")
        }
        println("무엇을 주문하시겠습니까?")
        setBeverage()
    }

    fun setBeverage() {
        while (true) {
            try {
                beverageOrder = readLine()!!.toInt()
            } catch (e: NumberFormatException) {
                beverageOrder = 0
            } finally {
                if (beverageOrder!! >= menu.categoryList[categoryNum!! - 1].size || beverageOrder == 0) {
                    println("다시 입력해 주세요")
                } else {
                    println("장바구니에 " + menu.categoryList[categoryNum!! - 1][beverageOrder!! - 1][0] + " 가 담겼습니다.")
                    break
                }
            }
        }
    }



        }


