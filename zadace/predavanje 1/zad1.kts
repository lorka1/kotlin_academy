fun calculateAge() {
    val yearOfBirth: Int
    val currYear: Int

    yearOfBirth = 2003
    currYear = 2024

    val year2048 = 2048 - yearOfBirth

    println("i am ${currYear - yearOfBirth} years old, and I will be $year2048 years old in 2048")
}

fun main() {
    calculateAge()
}

main()