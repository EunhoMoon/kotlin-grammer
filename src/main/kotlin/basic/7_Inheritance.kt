package basic

open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("bow wow")
    }
}

// override 된 프로퍼티나 함수는 자동으로 open 상태가 된다. 이를 막으려면 final 키워드를 사용하면 된다.
// 상위 class의 프로퍼티나 함수를 재사용하려면 Java와 마찬가지로 super() 키워드를 사용하면 된다.
open class Bulldog(override var age: Int = 0) : Dog() {
    //    final override fun bark() {
//        println("arr...")
//    }
    final override fun bark() {
        super.bark()
    }
}

abstract class Developer {

    abstract var age: Int

    abstract fun code(language: String)

}

class BackendDeveloper(override var age: Int = 0) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }

}

fun main() {
    val bulldog = Bulldog(age = 2)
    println(bulldog.age)
    bulldog.bark()

    val backendDeveloper = BackendDeveloper(age = 30)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")
}