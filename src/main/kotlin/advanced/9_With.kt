package advanced

/*
  With
    - 결과 반환 없이 내부에서 수신 객체를 이용하여 다른 객체를 호출할 때 사용
    - 확장 함수가 아니다.
*/
fun main() {

    val str = "Hello"

    val length = with(str) { length }
    println("length=$length")

}