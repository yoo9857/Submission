fun main() {
    val input = input()
    val calculator2 = Calculator2() //객체 생성

    val firstNumber = input.num("숫자를 입력해주세요 : ")
    val secondNumber = input.num("다음 숫자를 입력해주세요 : ")
    val operator = input.operation("연산 기호를 입력해주세요(+, -, *, /): ")

    val result = calculator2.start(operator, firstNumber, secondNumber)
    println("$firstNumber $operator $secondNumber = $result") // 계산을 수행하는 부분
}
 
    // 두 번째 숫자 입력
    class input {
        fun num(prompt: String): Double {
            while (true) {
                print(prompt)
                val input = readLine()
                if (input != null) {
                    val number = input.toDoubleOrNull() //더블 or null
                    if (number != null) {
                        return number
                    } else {
                        println("숫자를 입력해주세요")
                    }
                }
            }
        }
       
    
        fun operation(prompt: String): String {
            while (true) {
                print(prompt) // print(prompt)를 통해 사용자에게 입력을 요청하고, readLine()을 통해 사용자 입력을 읽어옵니다.
                val input = readLine()
                if (input != null && input in setOf("+", "-", "*", "/")) { 
                    return input // 입력이 null이 아니고, 입력이 setOf("+", "-", "*")에 속하는 유효한 연산자인 경우, 해당 입력을 반환합니다.
                } else {
                    println("바른 연산기호를 입력해주세요. (+, -, *,/)")
                }
            }
        }
    }


    //Calculator
    class Calculator2 {
        fun start(operator: String, firstNumber: Double, secondNumber: Double): Double {
            val result = when (operator) {
                "+" -> firstNumber + secondNumber
                "-" -> firstNumber - secondNumber
                "*" -> firstNumber * secondNumber
                "/" -> firstNumber / secondNumber
                else -> {println("잘못된 연산자입니다")
                    0.0  // 또는 다른 기본값을 반환하거나, 특정 동작을 수행할 수 있습니다.
            }
            }
            return result
        }
    }
    
    // 계산기 테스트

