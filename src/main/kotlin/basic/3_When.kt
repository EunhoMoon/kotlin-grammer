package basic

import basic.Color.*

fun main() {
    // Java 코드를 Kotlin의 When식으로 변환한 코드
    val day = 2

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }
    println(result)

    // else를 생략할 수 있다.(컴파일러가 추론 가능할 때)
    when (getColor()) {
        RED -> println("red")
        GREEN -> println("green")
    }

    // 여러개의 조건을 ','로 구분하여 한줄로 정의할 수 있다.
    when (getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("0 또는 1이 아님")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor() = RED

fun getNumber() = 2