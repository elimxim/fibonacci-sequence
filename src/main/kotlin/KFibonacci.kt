class KFibonacci {
    fun impl1(number: Int) : Int {
        var curr = 0
        var next = 1

        for (i in 0 until number) {
            next += curr.also { curr = next }
        }

        return curr
    }

    fun impl2(number: Int) : Int {
        var prev = 0
        var curr = 1

        if (number == 0) {
            return prev
        }

        for (i in 2..number) {
            curr += prev.also { prev = curr }
        }

        return curr
    }
}

fun main() {
    val fib = KFibonacci()

    for (n in 0..9) {
        println("$n number of Fibonacci is ${fib.impl2(n)}")
    }
}