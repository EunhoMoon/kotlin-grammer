package advanced

/*
  Apply
    - 수신 객체의 프로퍼티를 구성하고, 수신 객체의 결과를 그대로 반환할 때 사용
*/
fun main() {

    // 마지막 실행 값이 아닌 컨텍스트 객체가 반환값이 된다.
    val client: DatabaseClient = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
    }
    val connected = client.connect()
    println(connected)

}