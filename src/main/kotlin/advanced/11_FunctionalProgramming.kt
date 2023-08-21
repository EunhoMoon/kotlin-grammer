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

    val strList = listOf("a", "b", "c")
    val printStr: (String) -> Unit = { println(it) }
    forEachStr(strList, printStr)

    // 익명함수 호출
    outerFunc()()

    // 후행 람다 전달
    forEachStr(strList) {
        println(it)
    }

    // 람다 레퍼런스: 탑 레벨, 지역 변수일 경우 ::메서드, 객체의 멤버일 경우 객체::메서드 로 실행
//    val callReference: () -> Unit = { printHello() }
    val callReference = ::printHello

    callReference()()

    val numberList = listOf("1", "2", "3")

//    numberList.map { it.toInt() }.forEach { println(it) }
    numberList.map(String::toInt).forEach(::println)
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

// 고차함수: 함수를 인자로 받아 처리하거나 결과를 반환하는 함수, forEach, map도 고차함수이다.
fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

// 익명함수: 이름 없이 함수를 실행하고 해당 결과 값을 반환하는 함수, 람다로 변경해서 사용할 수 있다.
//fun outerFunc() : () -> Unit {
//    return fun() {
//        println("익명함수 호출")
//    }
//}
fun outerFunc() : () -> Unit = { println("익명함수 호출") }