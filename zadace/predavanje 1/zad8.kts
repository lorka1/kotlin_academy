fun isPrime(num: Int): Boolean {
    var counter = 0
    for (i in 1..num) {
        if(num % i == 0) {
            counter++
        }
    }
    if(counter == 2) {
        return true
    }
    else {
        return false
    }
}

fun main() {
    val num = readLine()!!.toInt()
    println("Number $num is a prime number: ${isPrime(num)}")
}

main()