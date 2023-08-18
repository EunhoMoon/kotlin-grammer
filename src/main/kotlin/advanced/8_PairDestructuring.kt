package advanced

//data class Tuple(val a: Int, val b: Int)

//fun plus(tuple: Tuple) = tuple.a + tuple.b

// Pair : tuple 형태의 객체 제공
fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
//    val plus = plus(Tuple(1, 3))
    val plus = plus(Pair(1, 3))
    println(plus)

    // pair는 data class 기반으로 만들어져있기 때문에 프로퍼티가 불변이다. 따라서 값을 변경하기 위해서는 copy를 사용해야 한다.
    val pair = Pair("A", 1)
    val newPair = pair.copy(first = "B")
    println(newPair)

    val second = newPair.component2()
    println(second)

    // Pair는 immutable list로 반환하는 확장함수를 제공한다.
    val list = newPair.toList()
    println(list)

    // Pair 외에도 Triple도 제공(기본적으로 Pair와 동일)
    val triple = Triple("A", "B", "C")
    println(triple)

    // 구조 분해 할당은 여러 변수를 한 번에 초기화할 수 있는 유용한 기능이다.
    val (a: String, b: String, c: String) = triple // 타입은 생략 가능하지만, 명시적으로 표기해주는 편이 좋다.
    println("$a, $b, $c")

    // map의 to 또한 Pair로 이루어져 있으며, key, value를 Pair로 전환할 수 있다.
//    val map = mutableMapOf("Janek" to "developer")
    val map = mutableMapOf(Pair("Janek", "developer"))
    for ((key, value) in map) {
        println("$key is $value")
    }
}