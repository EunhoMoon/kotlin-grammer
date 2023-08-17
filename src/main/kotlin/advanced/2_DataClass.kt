package advanced

/*
 Data Class
  - Data를 보관하거나 전달하는 목적을 가진 객체(Dto...)
  - 컴파일러가 equals, hashCode, toString, copy, component(n) 등의 함수를 자동으로 생성해준다.
*/
data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person(name = "Janek", age = 30)
    val person2 = Person(name = "Janek", age = 30)

    // equals(동등성 비교)
    println(person1 == person2) // true

    // hashCode
    val set = hashSetOf(person1)
    println(set.contains(person2))  // true

    // toString
    println(person1)

    // copy(불변성 유지)
    val person3 = person1.copy(name = "Eunho")
    println(person3)

    // component(n)
    println("이름=${person1.component1()}, 나이=${person1.component2()}")

    // 구조 분해 할당(내부적으로 component(n) 함수 사용)
    val (name, age) = person1
    println("이름=${name}, 나이=${age}")
}