package ConditionalStatement

import java.util.TreeMap

fun recognize(c:Char) = when(c){
    in '0'..'9' -> "it's a digit"
    in 'a'..'z', in 'A'..'Z' -> "it's a letter"
    else -> "I don't know.. sorry TT"
}

fun main(args: Array<String>) {
    val strList = arrayListOf("HELLO","WELCOME","BUSAN")
    for(str in strList) println(str)
    println("=================")

    for((index,str) in strList.withIndex()) println("$index, $str")

    val perInfo = TreeMap<String, String>()
    perInfo["name"] = "Name"
    perInfo["age"] = "23"
    perInfo["city"] = "BUSAN"

    for((key,value ) in perInfo) println("$key, $value")

}