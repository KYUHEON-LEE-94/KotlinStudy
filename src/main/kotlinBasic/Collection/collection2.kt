package Collection



fun main(args: Array<String>) {
    val list = arrayListOf("one","Two","three","Four")
    print(list.all { it.startsWith("T") })
}