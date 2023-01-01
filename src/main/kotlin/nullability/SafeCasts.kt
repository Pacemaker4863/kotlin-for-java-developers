package nullability

fun main() {
    fun myUppercase(any: CharSequence) {
        if (any is String) {
//            val s = any as String
//            s.uppercase()
            (any as? String)?.uppercase() // safe cast
        }
    }
}
