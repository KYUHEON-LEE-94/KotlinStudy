package Lamda

fun calculator(a:Int, b:Int, p:(Int, Int)->Int){
    println("$a, $b, ${p(a,b)}")
}

fun square(a:Int,p:(Int)->Int){
    println("$a, ${p(a)}")
}

fun PrintInfo(p:(() -> Unit)? = null){
    println("Calculator Version")
    p?.invoke()?: println("no version")
}

fun sum(a:Int, b:Int) = a+b


fun main(args: Array<String>) {
    val minus:(Int,Int) -> Int = {a,b -> a-b}
    calculator(1,2, minus)
}
