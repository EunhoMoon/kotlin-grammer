package with_java

fun main() {

  // java 스타일: 사용은 가능하지만 권장하지 않는다.
  val person = Person()
  person.setName("Janek")
  person.setAge(30)
  person.setAddress("gangnam")

  println(person.getName())
  println(person.getAge())
  println(person.getAddress())

  // kotlin 스타일
  val person2 = Person()
  person2.name = "Eunho"
  person2.age = 30

  println(person2.name)
  println(person2.age)

  // get으로 시작하는 메서드는 프로퍼티 처럼 사용 가능
  println(person2.uuid)

}