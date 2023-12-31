package basic

fun main() {
    // compile error
//    val a: String = null
//    var b: String = "abcde"
//    b = null

    // nullable type
    var a: String? = null
    println(a?.length)

    val b: Int = if (a != null) a.length else 0
    println(b)

    val c = a?.length ?: 0
    println(c)

    val nullableStr = getNullStr()
    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

    // NPE
//    throw NullPointerException()
//
//    val d: String? = null
//    val e = d!!.length
//    println(e)
}

fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0