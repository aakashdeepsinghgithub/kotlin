fun sumOfEvenNumbers(n: Int): Int {
    return if (n <= 0) {
        0
    } else if (n % 2 == 0) {
        n + sumOfEvenNumbers(n - 2)
    } else {
        sumOfEvenNumbers(n - 1)
    }
}

fun main() {
    val n = 10
    val result = sumOfEvenNumbers(n)
    println("Sum of even numbers from 1 to $n is: $result")
}
