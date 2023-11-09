class KFibonacci {

    /**
     * Implementation of a loop that starts
     * from the zero Fibonacci number of 0
     */
    fun impl1(number: Int) : Int {
        var curr = 0
        var next = 1

        for (i in 0 until number) {
            next += curr.also { curr = next }
        }

        return curr
    }

    /**
     * Implementation of a loop that starts
     * from the first Fibonacci number of 1
     */
    fun impl2(number: Int) : Int {
        var curr = 0
        var next = 1

        if (number == 0) {
            return curr
        }

        for (i in 0 until number - 1) {
            next += curr.also { curr = next }
        }

        return next
    }

    /**
     * Implementation of a loop that starts
     * from the second Fibonacci number of 1
     */
    fun impl3(number: Int) : Int {
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
        println("$n number of Fibonacci is ${fib.impl1(n)}")
    }
}