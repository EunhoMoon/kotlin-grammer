package advanced

import java.util.ArrayList
import java.util.LinkedList

fun main() {

    // immutable -> Java와 달리 add 함수가 없다. 완전 불변
    val currencyList = listOf("달러", "유로", "원")

    // mutable -> add, remove, addAll과 같은 함수 제공 및 값 수정 가능
//    val mutableCurrencyList = mutableListOf<String>()
//    mutableCurrencyList.add("달러")
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("원")

    // apply 함수를 사용하여 간소화 가능(this 생략 가능)
    val mutableCurrencyList = mutableListOf<String>().apply {
        this.add("달러")
        this.add("유로")
        this.add("원")
    }

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        this.add(1)
        this.add(2)
        this.add(3)
        this.add(4)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    // mutable map
    val mutableMap = mutableMapOf<String, Int>()
    mutableMap.put("one", 1)    // put도 가능 하지만 literal 권장
    mutableMap["two"] = 2
    mutableMap["three"] = 3

    // collection builder -> 내부에서는 MutableList를 사용하지만 반환 타입은 immutable한 List를 반환
    val numberList: List<Int> = buildList{
        add(1)  
        add(2)
        add(3)
    }

    // linkedList, arrayList -> 각 구현체의 생성자를 사용하여 접근 가능
    val linkedList = LinkedList<Int>().apply {
        addFirst(1)
        add(2)
        addLast(3)
    }

    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("=========")

    for (currency in currencyList) {
        println(currency)
    }

    println("=========")

    currencyList.forEach {
        println(it)
    }

    println("=========")

    // stream, asSequence와 같은 terminal operator를 생략할 수 있다.
    // 그러나 인라인 함수는 필터 체인마다 하나의 list를 생성하기 때문에, 데이터가 많거나 체인이 늘어날 경우 터미널 오퍼레이터를 사용하는 편이 좋다.
    // map
    val lowerList = listOf("a", "b", "c")
//    val upperList = mutableListOf<String>()

//    for (lower in lowerList) {
//        upperList.add(lower.uppercase())
//    }

    val upperList = lowerList.map { it.uppercase() }

    println(upperList)

    println("=========")

    // filter
//    val filteredList = mutableListOf<String>()
//    for (upper in upperList) {
//        if (upper == "A" || upper == "C") filteredList.add(upper)
//    }
    val filteredList = upperList.filter { it == "A" || it == "C" }

    println(filteredList)

}