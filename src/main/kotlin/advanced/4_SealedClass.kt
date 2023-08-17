package advanced

/*
  Sealed Class
    - 하나의 상위 class/interface에서 하위 class에 대한 정의를 제한할 수 있는 방법
    - 하위 class를 제한 조건에 따라 생성해야 하며, 이를 통해 컴파일러가 추론 가능해진다.(when...)
    - 제한 조건: 같은 package 또는 같은 module 안에 있어야 상속 가능.
*/
sealed class Developer {

    abstract val name: String

    abstract fun code(language: String)

}

data class BackendDeveloper(override val name: String) : Developer() {

    override fun code(language: String) {
        println("Im backend developer, using $language")
    }

}

data class FrontendDeveloper(override val name: String) : Developer() {

    override fun code(language: String) {
        println("Im frontend developer, using $language")
    }

}

object OtherDeveloper : Developer() {
    override val name: String = "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }

}

object DeveloperPool {

    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("An error occurred")
        // 컴파일러가 sealed class 추론이 가능하기 때문에 else 생략 가능
    }

    fun get(name: String) = pool[name]

}

fun main() {
    val backendDeveloper = BackendDeveloper(name = "Janek")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name = "Eunho")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("Janek"))
    println(DeveloperPool.get("Eunho"))
}
