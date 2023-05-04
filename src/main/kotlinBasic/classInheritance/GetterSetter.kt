package classInheritance

class Rectangle {
    var height: Int = 0
    var width: Int = 0

}
//만일 프로퍼티 타입이 'var' 타입이 아니라 'val' 타입이라면, 컴파일러는 게터만 만들고 세터는 만들지 않는다.


//커스텀 접근자
class Rectangle2(var height:Int, var width:Int){
    val isSquare: Boolean
        get() = (height == width)

}
//접근자의 가시성 변경자
class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}
fun main(args:Array<String>){
    val rect = Rectangle()
    rect.height = 10
    rect.width = 10
    println("height ${rect.height}, width: ${rect.width}")

    val rect2 = Rectangle2(10,10)
    println("rect2 is Square? ${rect2.isSquare}")

    val lengthCounter = LengthCounter()
    //set이 private 되었기 때문에 불가능
    //lengthCounter.counter = 1

    lengthCounter.addWord("TEST")
    //get은 가능
    println(lengthCounter.counter)

}