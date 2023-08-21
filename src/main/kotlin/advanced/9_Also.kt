package advanced

class User(val name: String, val password: String) {

    fun validate() {
        if (name.isNotEmpty() && password.isNotEmpty()) {
            println("Authorization success")
        } else {
            println("Authorization failed")
        }
    }

    fun printName() = println(name)

}

/*
  Also
    - 부수 작업을 수행하거나 전달받은 수신 객체를 그대로 결과로 반환하고자 할 때 사용
*/
fun main() {
//    val user: User = User(name = "Janek", password = "1234")
//    user.validate()

    User(name = "Janek", password = "1234").also {
        it.validate()
        it.printName()
    }
}