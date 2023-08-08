package basic

fun sum(a: Int, b: Int): Int {
    return a + b
}

// 표현식 스타일
fun sum2(a: Int, b: Int) : Int = a + b

// 표현식 & 반환 타입 생략
fun sum3(a: Int, b: Int) = a + b
/*
* 몸통이 있는 함수는 반환 타입을 생략하면 컴파일 오류 발생
* fun sum(a: Int, b: Int) {
*    return a + b
* }
*/

// 반환 타입이 없는 함수는 Unit을 반환(Java의 void와 유사)
fun printSum(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

// 디폴트 파라미터
fun greeting(message: String = "Hello!") {
    println(message)
}

//fun main() {
//    greeting()
//    greeting("Hi!")
//}

// named argument
fun log(level: String = "INFO", message: String) {
    println("[$level] $message")
}

fun main() {
    log(message = "인포 로그")
    log(level = "DEBUG", "디버그 로그")
    log("WARN", "워닝 로그")
    log(level = "ERROR", message = "에러 로그")
}