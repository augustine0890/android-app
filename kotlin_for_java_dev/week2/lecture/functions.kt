fun max(a: Int, b: Int): Int = if (a > b) a else b

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}
fun main() {
    println(max(5, 3));

    println(listOf("a", "b", "c").joinToString(
        separator = "", prefix = "(", postfix = ")"
    ))

    println(listOf(1, 2, 3).joinToString(postfix = "."))

    displaySeparator();
    displaySeparator('#', 5);
    displaySeparator(size = 7);
    displaySeparator(size = 3, character = '5') // 555

}