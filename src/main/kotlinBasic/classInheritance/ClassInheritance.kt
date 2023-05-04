package classInheritance

open class Book(val title:String, var price:Int){
    //상속가능 fun
    open fun printInfo(){
        println("Title: $title, Price: $price")
    }
}
                                                        //클래스를 상속받았다.
class EBook(title: String, price: Int, var url: String): Book(title, price) {
     //오버라이드를 위한 선언
    override fun printInfo() {
        println("Title: $title, Price: $price, URL: $url")
    }
}

//생성자가 없는경우
open class Book2(val title: String, var price: Int){
}
//클래스를 상속받았다.
class EBook2: Book2 {
    var url = ""
    constructor(title: String, price: Int, url: String):super(title,price){

    }

}


fun main(args: Array<String>){
    val book = Book("Life",2000)
    val ebook = EBook("Life",1000,"url.com")
    book.printInfo()
    ebook.printInfo()
}