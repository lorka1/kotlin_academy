fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var number = readLine()!!.toInt()
    while(number <= a || number >= b){
        number = readLine()!!.toInt()
    }

    var max = 0
    var temp = number
    var digit = 0

    while(temp > 0) {
        digit = temp % 10
        if(digit > max) {
            max = digit
        }
        temp /= 10
        temp.toInt()
    }
    println("maximum digit of number $number is $max")
}

main()