package advanced

class HelloBot {

    // 불변을 유지하면서 사용하는 시점으로 초기화를 미룰 수 있다.
    val greeting: String by lazy {
        println("val init")
        getHello()
    }

    fun sayHello() = println(greeting)

}

fun getHello() = "Hello!"

fun main() {
    val helloBot = HelloBot()

    // 초기화는 처음 사용시 한 번만 된다.
    // 멀티 스레드 환경에서도 안전하게 설계되어있다.(by lazy(LazyThreadSafetyMode.NONE)를 사용하여 해당 Lock을 해제할 수 있다. default = SYNCHRONIZED)
    for (i in 1..5) {
        Thread {
            helloBot.sayHello()
        }.start()
    }
}