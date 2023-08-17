package advanced

/*
  Class를 상속하거나 Decorator 패턴 등을 사용하지 않아도 Class를 확장할 수 있다.
   - 이를 통해 표준 라이브러리에 custom한 확장 함수 및 프로퍼티를 추가할 수 있다.
   - this(수신자 객체): 확장되는 객체의 참조.
   - 확장함수를 디컴파일할 경우 항상 static final이며, 첫번째 인자는 항상 수신자 객체(this)이다.
*/

fun String.first(): Char {
  return this[0]
}

fun String.addFirst(char: Char): String {
  return char + this.substring(0)
}

// 기존에 동일한 이름의 함수가 존재할 경우 멤버 함수(확장 함수 x)가 우선되는 규칙이 존재한다.(인자가 다를 경우 사용 가능)
class MyExample {
  fun printMessage() = println("클래스 출력")
}

//fun MyExample.printMessage() = println("확장 출력")
fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull() {
  if (this == null) println("Is Null")
  else println("Not Null")
}

fun main() {
  println("ABCD".first())
  println("ABCD".addFirst('Z'))

  MyExample().printMessage()
  MyExample().printMessage(message = "확장 출력")

  // 내부에 null에 대한 처리가 되어있기 때문에 안전 연산자를 사용하지 않아도 컴파일 오류가 발생하지 않는다.
  var myExample: MyExample? = null
  myExample.printNullOrNotNull()
}