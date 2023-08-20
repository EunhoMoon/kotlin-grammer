package advanced

/*
  스코프 함수
    - 코틀린 표준 라이브러리에는 객체의 컨텍스트 내에서 코드 블록을 실행하기 위해서만 존재하는 몇가지 함수가 포함되어 있으며, 이를 스코프 함수라고 한다.
    - 스코프 함수를 사용함으로 불필요한 변수 선언이 없어지며 코드를 간결하게 작성할 수 있다.
    - 스코프 함수 블록 내부에서는 변수명을 사용하지 않고도 객체에 접근할 수 있으며, 이는 수신자 객체에 접근할 수 있기 때문이다.
    - 수신자 객체는 람다식 내부에서 사용할 수 있는 객체의 참조
    - 스코프 함수를 사용하면 수신자 객체에 대한 참조로 this 또는 it 을 사용한다.
*/
// let: 객체에 대한 확장함수로 반환 타입을 가질 수 있으며, 갖지 않을 수도 있다.
// fun <T, R> T.let(T -> R): R
fun main() {
  val str: String? = "Hello"
  val result: Int? = str?.let {
    println(it)

    // 중첩하여 사용할 수 있으나 가독성을 해칠 수 있기에 if-else 등의 구문을 선택하는 것도 방법이다.
    val abc: String? = "abc"
//
//    abc?.let {
//      val def: String? = "def"
//      def?.let {
//        println("abcdef is not null")
//      }
//    }
    val def: String? = "def"
    if (!abc.isNullOrBlank() && !def.isNullOrBlank()) println("abcdef is not null")
    1234
  }
  println(result)
}