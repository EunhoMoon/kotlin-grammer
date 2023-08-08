package basic

import java.lang.IllegalArgumentException

fun main() {

    // try~catch 생략 가능
    println("test start")
    Thread.sleep(1000)
    println("test end")

    // try~catch~finally를 사용하여 명시적으로 작성 가능
    try {
        println("test start")
        Thread.sleep(1000)
        println("test end")
        throw RuntimeException()
    } catch (e: Exception) {
        println("error occurred!!!")
    } finally {
        println("finally run")
    }

    // Kotlin의 try~catch문은 표현식이기 때문에 값 전달 가능
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("error occurred!!!")
    }
    println(a)

//    failFast("예외발생")
//    println("실행 안되는 코드")    // Unreachable Code -> return type이 Nothing이기 때문에 실행 보장 X

    // elvis 연산자와 Nothing 타입을 같이 사용하는 경우 compiler가 non null 타입으로 추론 가능
    val b: String? = null
    val c: String = b ?: failFast("b is null")
    println(c.length)
}

// 코드가 정상적으로 수행할지 보장하지 않는 타입: Nothing
fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}