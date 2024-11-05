fun main() {
    val fstNumber = readLine()!!.toInt()
    val sndNumber = readLine()!!.toInt()
    val trdNumber = readLine()!!.toInt()
    val max = maxOf(fstNumber, sndNumber, trdNumber)
    println("max: $max")
}

main()