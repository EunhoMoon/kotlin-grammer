package advanced

/*
  FP에서 함수는 일급 객체(함수를 반환하거나, 인자, 변수에 대입 가능)
    - 함수도 타입이다. val func: () -> Unit = {}
*/
fun main() {

    val list = mutableListOf(printHello)

    val func: () -> Unit = list[0]
    func()

    call(func)
    // fun으로 선언한 함수는 일급 객체의 특성을 가지지 않는다.
//    list.add(printNo)
//    call(printNo)
//    컴파일 오류

    val result: Int = plus(1, 2)
    println(result)
}

//fun printHello() {
//
//}
val printHello: () -> Unit = { println("Hello") }

// 함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()
}

fun printNo() = println("No")

//val printMessage: (String) -> Unit = { message: String -> println(message) }
//val printMessage: (String) -> Unit = { message -> println(message) }    // 이미 함수 타입에 type이 선언되어 있기 때문에 함수 인자의 type 생략 가능
val printMessage: (String) -> Unit = { println(it) }    // it을 통해 인자에 대한 참조 표현 가능

val plus: (Int, Int) -> Int = { a, b -> a + b }