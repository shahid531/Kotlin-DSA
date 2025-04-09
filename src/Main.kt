fun main() {
    println(reverseString("hello"))
}

fun reverseString(s: String): String {
    var output = ""
    for (i in s.length - 1 downTo 0) {
        output += s[i]
    }
    return output
}



