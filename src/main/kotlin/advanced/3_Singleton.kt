package advanced

import java.time.LocalDateTime

/*
  object 키워드를 사용하여 손쉽게 singleton 객체 생성 가능
   - util class, 상수 집합으로 사용 가능
*/
object Singleton {

    val a = 1234

    fun printA() = println(a)

}

object DatetimeUtils {

    val new: LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD" // const : 상수

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean = a == b

}

/*
  동반 객체
    - ccompanion object 키워드를 사용하여 클래스 내부에서 생성되는 객체
*/
class MyClass private constructor() {

    companion object MyCompanion {
        val a = 1234

        fun newInstance() = MyClass()
    }
}

fun main() {
    println(Singleton.a)
    Singleton.a

    println(DatetimeUtils.new)
    println(DatetimeUtils.new)
    println(DatetimeUtils.new)

    println(DatetimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()
    println(DatetimeUtils.same(now, now))

//    println(MyClass.Companion.a)
//    println(MyClass.Companion.newInstance())

    // 동반 객체에 이름 추가 가능(Companion으로 호출 불가)
//    println(MyClass.MyCompanion.a)
//    println(MyClass.MyCompanion.newInstance())

    // Companion 생략 가능
    println(MyClass.a)
    println(MyClass.newInstance())

}