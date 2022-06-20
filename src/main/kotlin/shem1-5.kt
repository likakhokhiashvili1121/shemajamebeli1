import java.util.*

fun main() {

    val read = Scanner(System.`in`)

    println("Enter n:")
    var n = read.nextInt()

    var reverseN = 0
    while (n != 0) {
        val remainder = n % 10
        reverseN = reverseN * 10 + remainder
        n /= 10
    }

    println("Reversed N = $reverseN")
}
