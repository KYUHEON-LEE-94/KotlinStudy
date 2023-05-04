package DataTypeAndOperator

fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c:Char) = c !in '0'..'9'

fun recognize(c:Char) = when(c){
    in '0'..'0' -> "it's a digit"
    in 'a'..'z', in 'A'..'Z' -> "it's a letter"
    else -> "I don't know.. sorry TT"
}
fun main(args: Array<String>) {
    var c:Char = 'm'
    println(isLetter(c))
    println(isNotDigit(c))
}