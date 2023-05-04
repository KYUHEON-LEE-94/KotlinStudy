package classInheritance

interface InterfaceInheritance {
    fun click()
    //Java와 다르게 인터페이스에서도 구현이 가능
    fun showOff() = println("I'm Clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

//Interface 상속받아서 구현
class Btn:InterfaceInheritance, Focusable{
    override fun click() = println("I was Clicked")
    //두 Interface가 공통된 showOff 메서드를 가지고 있는경우
    override fun showOff() {
        super<Focusable>.showOff()
        super<InterfaceInheritance>.showOff()
    }
}

interface User{
    val nickName:String
}

class PrivateUser(override val nickName:String):User
class SubscribingUser(val email:String):User{
    override val nickName: String = getId()
    fun getId() = email.substringBefore('@')
}

fun main(args:Array<String>){
    val Button = Btn()
    Button.showOff()

    println(PrivateUser("nick").nickName)
    println(SubscribingUser("tenten@naver.com").nickName)
}