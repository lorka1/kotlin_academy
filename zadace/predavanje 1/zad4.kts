fun main() {
    val character = readLine()!!
    val c = character.lowercase()

    val result = when(c) {
        "a", "e", "i", "o", "u" -> "vowel"
        in "b".."z" -> "consonant"
        else -> "number"
    }
    println("character  is a $result")
}