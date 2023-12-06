package com.example.kioskstudy

fun main() {
    var main = Main()

    // 주문 시작
    main.startOrder()

    // Basket을 통한 음료 주문
    main.basket.showCategory()
    main.basket.showBeverage()

    // 추가 주문이 없을 때까지 반복
    while (main.basket.isOrderChange != 2) {
        main.basket.showCategory()
        main.basket.showBeverage()
    }

}

class Main {
    var menu = MenuList()
    var basket = Basket(menu)
    var startOrder: Int? = 0

fun startOrder() {
    println("맥도날드에 오신걸 환영합니다..")
    println("주문하시겠습니까?\n주문하시려면 1.번을 눌러주세요")
    while (true) {
        try {
            startOrder = readLine()?.toIntOrNull() ?: 0
        } catch (ex: Exception) {
            startOrder = 0
        } finally {
            if (startOrder == 1) {
                break
            } else {
                println("다시 입력해 주세요")
            }
        }
    }
}
}