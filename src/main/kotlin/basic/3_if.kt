package basic

fun main() {
    // if...else
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("비개발자")
    }

    // Kotlin의 if...else는 표현식
    val age: Int = 10

    val str = if (age > 10) {
        "성인"
    } else {
        "어린이"
    }
    println(str)

    // Kotlin은 삼항 연산자가 없다. if...else가 표현식이기 때문에 불필요
    val a = 1
    val b = 2
    val c = if (b > a) b else a
    println(c)
}