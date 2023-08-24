package with_java

class HelloClass {
  companion object {

    @JvmStatic
    fun hello() = "hello!"

  }

}

object HiObject {

  @JvmStatic
  fun hi() = "hi!"

}


/*
  JVM static을 이용한 정적 함수 호출
    - 동반 객체(companion object)와 object 키워드로 정의된 singleton 객체에서 정의된 함수를 java의 static 메서드와 같이 사용 가능
    - @JvmStatic 어노테이션을 이용해 java에서 static과 같이 Companion이나 INSTANCE 키워드 없이 사용 가능
*/
fun main() {

  val hello = HelloClass.hello()

  val hi = HiObject.hi()

}