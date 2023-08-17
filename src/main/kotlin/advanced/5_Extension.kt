package advanced

/*
  Class를 상속하거나 Decorator 패턴 등을 사용하지 않아도 Class를 확장할 수 있다.
   - 이를 통해 표준 라이브러리에 custom한 확장 함수 및 프로퍼티를 추가할 수 있다.
   - this(수신자 객체): 확장되는 객체의 참조.
*/

fun String.first() : Char {
    return this[0]
}

fun String.addFirst(char: Char) : String {
    return char + this.substring(0)
}

fun main() {
    println("ABCD".first())
    println("ABCD".addFirst('Z'))
}