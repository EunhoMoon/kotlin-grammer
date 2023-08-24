package with_java

class JvmFieldClass {

  companion object {
    @JvmField
    val id = 1234

    const val CODE = 1234
  }

}

object JvmFieldObject {

  @JvmField
  val name = "Janek"

  const val FAMILY_NAME = "Moon"

}

fun main() {

  val id = JvmFieldClass.id

  val name = JvmFieldObject.name

}