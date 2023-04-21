package Constructor

class Button2(var id:Int){
 var text:String = ""
 var isCehckbox = false
 //주생성자가 정의된 경우, 부 생성자에서는 반드시 주생성자를 재호출해야한다.
 constructor(id:Int, text:String): this(id){
  this.text = text
 }
 //부생성자가 여러개일 경우 부생성자에서 다른 부생성자를 호출할 수 있지만, 재호출되는 부생성자에서는 반드시 주생성자가 재호출되어야 한다.
 //즉, 주 생성자는 반드시 호출되어야 한다.
 constructor(id:Int, text:String, isCehckbox:Boolean):this(id,text){
  this.isCehckbox = isCehckbox
 }
}
//코틀린 개발자는 다음과 같이 명시했다.
 //인자에 대한 디폴트 값을 제공하기 위해 부 생성자를 여러 개 만들지 말라. 대신 파라미터의 디폴트 값을 주 생성자 시그니처에 직접 명시하라.
//즉 이렇게 만들면 된다.
class Button3(var id: Int, var text: String = "", var isCheckbox: Boolean = false)

fun main(args:Array<String>) {

 var name = "test"
  var two = 2

  //클래스 생성하는 방법
//  var btn:Button = Button()
  //추론 가능
  var btn = Button2(100)
  btn.id = 100
  println("btn 아이디: ${btn.id}")

}