class Calculator(val operator: AbstractOperation) {
    fun operate(num1: Double, num2: Double): Double {
        return operator.operate(num1, num2)
    }
}
