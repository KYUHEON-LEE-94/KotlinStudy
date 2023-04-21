package DataTypeAndOperator

class Bitmap3(val width: Int, val height: Int) {
    val size: Int
        get() = width*height
    val minus: Int
        get() = width - height
    val map = ByteArray(size)
}

fun CreateBitmap2(width: Int, height: Int): Bitmap3? {
    if (width > 0 && height > 0) return Bitmap3(width, height)
    else return null
}

class Address(val st: String, val zipCode: Int, val city: String)
class Company(val name: String, val addr: Address?)
class Person(val name: String, val company: Company?)

fun Person.cityName():String{
    val city = this.company?.addr?.city
    return city?: "Unknown"
}

fun main(args: Array<String>) {
    val bitmap: Bitmap3? = CreateBitmap2(10, 10)
    println(bitmap?.size)
}
