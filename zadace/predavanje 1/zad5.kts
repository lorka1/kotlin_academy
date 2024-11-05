fun main() {
    val n = readLine()!!.toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println("Sum of first $n numbers is $sum")
}

main()