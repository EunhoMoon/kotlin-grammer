package advanced

/*
  Run
    - 수신 객체의 프로퍼티를 구성하거나 새로운 결과를 반환할 때 사용
*/
class DatabaseClient {
  var url: String? = null
  var username: String? = null
  var password: String? = null

  // DB에 접속하고 Boolean 결과 값을 반환
  fun connect(): Boolean {
    println("DB 접속 중...")
    Thread.sleep(1000)
    println("DB 접속 완료")
    return true
  }
}

fun main() {

//  val config = DatabaseClient()
//  config.url = "localhost:3306"
//  config.username = "mysql"
//  config.password = "1234"
//  val connected = config.connect()

  val connected = DatabaseClient().run {
    url = "localhost:3306"
    username = "mysql"
    password = "1234"
    connect()
  }

  println(connected)
}