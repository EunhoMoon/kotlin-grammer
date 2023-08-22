package with_java

import java.io.IOException

class KotlinThrow {

//  @Throws(IOException::class) // java에서 사용할 때 예외처리를 강제할 수 있다.
  fun throwIOException() {
    throw IOException("Checked Exception, IOException occurred")
  }

}

fun main() {
  // checked exception이 없기 때문에 try catch를 강제하지 않는다.
  val javaThrow = JavaThrow()
  javaThrow.throwIOException()

  val kotlinThrow = KotlinThrow()
  kotlinThrow.throwIOException()
}