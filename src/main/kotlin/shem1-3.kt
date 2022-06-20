fun main(args: Array<String>) {
    println("sheiyvanet x: ")
    var x = readLine()
    val ch = '$'
    var frequency = 0

    if (x != null) {
        for (i in 0..x.length - 1) {
            if (ch == x[i]) {
                ++frequency
            }
        }
    }

    println("Frequency of $ch = $frequency")
}