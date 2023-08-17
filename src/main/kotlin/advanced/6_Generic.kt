package advanced

class MyGenerics<out T>(val t: T) {

}

class Bag<T> {

  fun saveAll(
    to: MutableList<in T>,
    from: MutableList<T>
  ) {
    to.addAll(from)
  }

}

fun main() {

  // 제네릭을 사용한 클래스의 인스턴스를 생성하기 위해 타입 인자를 제공(컴파일이 추론 가능할 경우 생략 가능)
  // val generics = MyGenerics<String>(t = "테스트")
  val generics = MyGenerics(t = "테스트")

  // 변수의 타입에 제네릭을 사용한 경우
  val list1: MutableList<String> = mutableListOf()

  // 타입 인자를 생성자에 추가
  val list2 = mutableListOf<String>()

  // *를 사용할 경우 정확한 타입을 알지 못해도 제네릭을 사용 가능
  val list3: List<*> = listOf<String>("테스트")
  val list4: List<*> = listOf<Int>(1, 2, 3, 4)

  /*
   변성 - 제네릭에서 파라미터화 된 타입이 서로 어떤 관계에 있는지 설명하는 개념
     - 크게 공변성, 반공변성, 무공변성으로 나뉜다.(PECS)
     - PECS: Producer-Extends, Consumer-Super
     - 공변성은 자바 제네릭의 extends(<? extends T>), 코틀린에서는 out
     - 반공변성은 자바 제네릭의 super, 코틀린에서는 in
  */
  // String은 CharSequence의 서브타입이기 때문에 공변성이 성립, out키워드를 사용함으로써 처리 가능
  val myGenerics = MyGenerics<String>("테스트")
  val charGenerics: MyGenerics<CharSequence> = myGenerics

  // 상위 타입인 CharSequence를 함수 내부에서 사용하기 위해 반공변하게 동작하도록 함수 인자에 in 사용
  val bag = Bag<String>()
  bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))
}