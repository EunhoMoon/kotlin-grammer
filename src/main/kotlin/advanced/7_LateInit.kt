package advanced

/*
  LateInit
    - 가변 프로퍼티에 대한 지연 초기화를 위해 사용
    - 가변 타입의 non null 프로퍼티에 사용
    - DI, Junit setup 등 사용
    - 초기화 전에 사용할 경우 Exception 발생
    - isInitialized는 외부에서 접근할 수 없기 때문에 getter와 같은 방법으로 우회 접근해야 한다.
*/
class Test {

    lateinit var text: String

    fun printText() {
        if (this::text.isInitialized) println("init")
        else text = "Hello"

        println(text)
    }

}

fun main() {
    val test = Test()
    test.printText()
}
