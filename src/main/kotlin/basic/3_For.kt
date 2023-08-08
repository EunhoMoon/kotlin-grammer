package basic

fun main() {
    // 범위 연산자 '..'를 사용한 for loop(마지막 값 포함)
    for (i in 0 .. 3) {
        println(i)
    }
    println()

    // until을 사용해 반복(마지막 값 미포함)
    for (i in 0 until 3) {
        println(i)
    }
    println()

    // step 에 들어온 값 만큼 증가시킨다.
    for (i in 0..6 step 2) {
        println(i)
    }
    println()

    // downTo를 사용해 반복하며 값 감소
    for (i in 3 downTo 1) {
        println(i)
    }
    println()

    // 전달받은 배열 반복
    val numbers = arrayOf(1, 2, 3)

    for (number in numbers) {
        println(number)
    }
}