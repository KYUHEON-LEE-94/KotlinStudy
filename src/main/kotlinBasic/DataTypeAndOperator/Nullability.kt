package DataTypeAndOperator

internal class StringEx(var s: String) {
    fun strlen(): Int {
        return s.length
    }
}

class Bitmap(val width: Int, val height: Int) {
    val size: Int
        get() = width*height
    val map = ByteArray(size)
}

fun CreateBitmap(width: Int, height: Int): Bitmap? {
    if (width > 0 && height > 0) return Bitmap(width, height)
    else return null
}

fun main(args: Array<String>) {
    val bitmap: Bitmap? = CreateBitmap(10,10)
    if (bitmap != null) println(bitmap.size)
}