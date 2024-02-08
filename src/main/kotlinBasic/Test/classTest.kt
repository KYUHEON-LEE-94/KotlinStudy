package Test

/**
 *packageName    : Test
 * fileName       : classTest
 * author         : heon
 * date           : 2024-02-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08           heon               최초 생성
 */
data class Person(val name:String, val age:Int)
fun main() {
    var p1 = Person("LEE", 12)
    var p2 = Person("LEE", 12)

    //동등성 검삭
    println(p1 == p2)
    //인스턴스 검사
    println(p1 === p2)

    //toString
    println(p1.toString())

    val p3 = p1.copy()
    println(p3 === p1)

}