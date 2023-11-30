fun main() {
    // 입력 값
    print("숫자를 입력하세요 : ")
    var number1 = readLine()!!.toDouble()
    print("연산자를 입력하세요 : ")
    var operator = readLine()!!
    print("숫자를 입력하세요 : ")
    var number2 = readLine()!!.toDouble()

    // 객체 인스턴스화
   
    val addOperation = addOperation(number1:Double,number2:Double)
    val subOperation = subOperation(number1:Double,number2:Double)
    val mulOperation = mulOperation(number1:Double,number2:Double)
    val divOperation = divOperation(number1:Double,number2:Double)
    
    when (operator) {
        "+" -> println(addOperation.addition(number1:Double,number2:Double))
        "-" -> println(subOperation.subtraction(number1:Double,number2:Double))
        "/" -> println(divOperation.division(number1:Double,number2:Double))
        "*" -> println(mulOperation.multiplication(number1:Double,number2:Double))
        else -> println("유효하지 않은 연산자입니다.")
    }
}
class addOperation(number1:Double,number2:Double) {
    fun addition(number1: Double, number2: Double): Double = number1 + number2
}
class subOperation(number1:Double,number2:Double) {
    fun subtraction(number1: Double, number2: Double): Double = number1 - number2
}
class mulOperation(number1:Double,number2:Double) {
    fun multiplication(number1: Double, number2: Double): Double = number1 * number2
}
class divOperation(number1:Double,number2:Double) {
    fun division(number1: Double, number2: Double): Double = number1 / number2
}


