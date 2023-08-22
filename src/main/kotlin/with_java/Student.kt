package with_java

import java.time.LocalDate

class Student {

  var name: String? = null

  var birthDate: LocalDate? = null

  val age: Int = 10

  var grade: String? = null
    private set // var로 선언되어 있어도 setter 호출을 막는다.

  @JvmField
  var jvmValue: String? = null

  fun changeGrade(grade: String) {
    this.grade = grade
  }
}