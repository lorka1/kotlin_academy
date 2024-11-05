fun nthPower(n: Int, number: Int): Int {
    var power = 1
    for(i in 1..n) {
        power *= number
    }
    return power
}


fun main() {
    val n = readLine()!!.toInt()
    val number = readLine()!!.toInt()
    println("${n} power of $number is ${nthPower(n, number)}")
}

main()