package nullability

fun main() {
    val s1: String = "Always not null"
    val s2: String? = null
    // val s3: String = null // NO
    val s4: String? = "Can be null or non null"

    val len: Int = s2?.length ?: 0 // ?: Elvis operator
    println(len)
    val anotherLen: Int?= s4?.length
    println(anotherLen)

    val s: String? = null
    // s!!.length // !! throws a NPE

}
