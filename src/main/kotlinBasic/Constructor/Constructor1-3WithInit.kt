package Constructor


class Button4(var id:Int){
 var text:String = ""
 init {
     println("Init Block: $id, $text")
 }
 //부생성자: JAVA로치면 여러개의 생성자중 하나라고 생각
 constructor(id:Int, text:String):this(id){
  this.text = text
  println("생성자: ${this.id}, ${this.text}")
 }
}

fun main(args:Array<String>) {
 val button4 = Button4(100)
 val btn4 = Button4(101, "Button4")

}