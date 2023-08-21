package advanced

import java.io.FileWriter

fun getStr(): Nothing = throw Exception("Error occurred")

fun main() {

    // use를 사용할 경우 자동으로 try with resource문을 생성해준다.
    FileWriter("test.txt")
        .use {
            it.write("Hello Kotlin")
        }

    // result 패턴을 사용하는 runCatching 식을 사용할 수 있다.
//    val result = try {
//        getStr()
//    } catch (e: Exception) {
//        println(e.message)
//    "Default Value"
//    }

    // getOrNull: 실패시 null 반환
    val getOrNull = runCatching { getStr() }.getOrNull()
    println(getOrNull)

    // exceptionOrNull: 실패시 exception 반환, 성공시 null 반환
    val exceptionOrNull = runCatching { getStr() }.exceptionOrNull()
    println(exceptionOrNull)

    // getOrDefault: 실패시 Default Value 반환
    val getOrDefault = runCatching { getStr() }.getOrDefault("Default Value")
    println(getOrDefault)

    // getOrElse: 실패시 함수의 결과 반환
    val getOrElse = runCatching { getStr() }.getOrElse {
        println(it.message)
        "Default Value"
    }
    println(getOrElse)

    // getOrThrow: 실패시 예외 발생
//    val getOrThrow = runCatching { getStr() }.getOrThrow()

    // map: 성공시 원하는 값 반환
    val map = runCatching { "test" }.map { "$it" }.getOrThrow()
    println(map)

    // mapCatching: map 사용시 예외 처리
    val mapCatching = runCatching { "test" }.mapCatching { throw Exception("Error occurred") }
        .getOrDefault("Default Value")
    println(mapCatching)

    // recover: 실패시 원하는 값 반환
    val recover = runCatching { getStr() }.recover { "Recover" }.getOrNull()
    println(recover)

    // recoverCatching: recover 사용시 예외 처리
    val recoverCatching = runCatching { getStr() }.recoverCatching { throw Exception("Error occurred") }
        .getOrDefault("Default Value")
    println(recoverCatching)

}
