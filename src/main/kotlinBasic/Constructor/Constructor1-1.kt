package Constructor

class Button(var id:Int, val x:Int = 0, val y:Int = 0){

}

fun sum(a:Int, b:Int = 10) = a+b

fun main(args:Array<String>) {
  println(sum(1))

 var name = "test"
  var two = 2

  //클래스 생성하는 방법
//  var btn:Button = Button()
  //추론 가능
  var btn = Button(100)
  btn.id = 100
  println("btn 아이디: ${btn.id}")

}