package Collection

val list:List<Int> = List(5) { i -> i }

val list2:List<Int> = listOf(1,2,3,4)

val array1 = MutableList<Int>(5){i ->i}

val array2 = mutableListOf(1,2,3)

val arraylist1 = ArrayList<Int>()
val arraylist2 = arrayListOf(1,2,3)

val set1:Set<Int> = setOf(3,3,1,2)

val map1:Map<String,Int> = mapOf("One" to 1, "Two" to 2, "Three" to 3)
val map2:Map<String,Int> = mapOf(Pair("Four",4), Pair("Five", 5))

fun main(args: Array<String>) {
    println(map1)
    println(map2)
    println(map1.get("Two"))
}