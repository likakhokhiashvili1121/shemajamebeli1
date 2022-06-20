import java.util.*

fun main() {

    val read = Scanner(System.`in`)

    println("Enter a:")
    val a = read.nextInt()

    println("Enter b:")
    val b = read.nextInt()

    val lcm = findLCM(a, b)

    println("LCM of $a and $b: $lcm")
}

private fun findLCM(a: Int, b: Int): Int {

    val biggerNum = if(a > b) a else b
    var lcm = biggerNum
    while(true) {

        if(((lcm % a) == 0) && ((lcm % b) == 0)) {
            break
        }

        lcm  += biggerNum
    }

    return lcm
}
