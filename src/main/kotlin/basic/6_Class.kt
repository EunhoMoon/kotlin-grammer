package basic

// constructor는 생략 가능
// class Coffee constructor(val name: String) {
// var 키워드로 생성시 자동으로 getter, setter 생성(val 키워드는 getter만 존재)
class Coffee(
//    val name: String,
//    val price: Int
    var name: String = "",
    var price: Int = 0,
    var iced: Boolean = false,
) {

    // custom getter, setter 생성 가능
    val brand: String
        get() = "스타벅스"

    var quantity: Int = 0
        set(value) {
            // field: getter, setter의 프로퍼티에 접근하기 위한 backing field
            // 변수에 바로 접근할 경우 무한 재귀가 발생하기 때문에 StackOverflow 발생
            if (value > 0) field = value
        }
}

// 본문이 없는 class 생성 가능
class EmptyClass

fun main() {
    val coffee = Coffee()
    // setter 사용 할당
    coffee.name = "카페라떼"
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true
    
    if (coffee.iced) println("아이스 커피")  // Kotlin의 상태는 메서드가 아닌 프로퍼티로 접근(내부적으로는 메서드)

    println("${coffee.brand} ${coffee.name}의 가격은 ${coffee.price} / 수량: ${coffee.quantity}")
}