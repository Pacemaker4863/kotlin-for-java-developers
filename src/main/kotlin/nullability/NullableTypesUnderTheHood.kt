package nullability

// nullable elements vs nullable lists

// List<Int?> aList
// List<Int>?

fun foo(list1: List<Int?>, list2: List<Int>?) {
    list1.size
    list2?.size

    val i: Int? = list1.get(0)
    val j: Int? = list2?.get(0)
}
