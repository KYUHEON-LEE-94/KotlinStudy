package classInheritance

class DataClass {

    //데이터 클래스란, 클래스가 메서드 없이 프로퍼티만을 가질 때 사용할 수있는 클래스이다.
    data class Client(val name:String, val postalCode:Int)

    fun main(args:Array<String>){
        val client = Client("Monuse",1234);
        println(client)
    }

}