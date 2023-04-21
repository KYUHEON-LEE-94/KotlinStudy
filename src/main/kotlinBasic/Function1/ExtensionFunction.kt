package Function1

class Calculator {
    fun sum(a: Int, b: Int) = a+b
    fun minus(a: Int, b: Int) = a-b
}

fun Calculator.sum(a: Int, b: Int, c: Int) = sum(a,b)+c
fun Calculator.minus(a: Int) = -a


//확장 프로퍼티
class Calculator2 {
    var lastResult: Int = 0

    fun sum(a: Int, b: Int): Int {
        lastResult = a+b
        return lastResult
    }
    fun minus(a: Int, b: Int): Int {
        lastResult = a-b
        return lastResult
    }
}
val Calculator2.signResult: Char
    get() = if(lastResult<0) '-' else '+'



fun main(args: Array<String>) {
    val calc = Calculator()
    println("1+2 = ${calc.sum(1,2)}")
    println("2-1 = ${calc.minus(2,1)}")
    println("${calc.sum(1,2,3)}")

    val calc2 = Calculator2()
    println("minus(1,2) = ${calc2.minus(1,2)} (${calc2.signResult})")
}