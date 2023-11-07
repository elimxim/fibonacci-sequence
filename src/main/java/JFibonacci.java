import java.util.stream.IntStream;

public class JFibonacci {

    /**
     * Implementation of a loop that starts
     * from the first Fibonacci number of 0
     */
    int impl1(int number) {
        int curr = 0;
        int next = 1;

        for (int i = 0; i < number; i++) {
            int prev = curr;

            curr = next;
            next += prev;
        }

        return curr;
    }

    /**
     * Optimization of implementation {@code impl_1}
     * that prevent calculating of the next Fibonacci number
     * on the last iteration
     */
    int impl1o1(int number) {
        int curr = 0;
        int next = 1;

        for (int i = 0; i < number; i++) {
            int prev = curr;

            curr = next;

            if (i == number - 1) {
                next += prev;
            }
        }

        return curr;
    }

    /**
     * Optimization of implementation {@code impl_1}
     * that prevent calculating of the next Fibonacci number
     * on the last iteration
     */
    int impl1o2(int number) {
        int curr = 0;
        int next = 1;

        if (number == 0) {
            return curr;
        }

        for (int i = 0; i < number - 1; i++) {
            int prev = curr;

            curr = next;
            next += prev;
        }

        return next;
    }

    /**
     * Implementation of a loop that starts
     * from the second Fibonacci number of 1
     */
    int impl2(int number) {
        int prev = 0;
        int curr = 1;

        if (number == 0) {
            return prev;
        }

        for (int i = 2; i <= number; i++) {
            int next = prev + curr;

            prev = curr;
            curr = next;
        }

        return curr;
    }

    /**
     * Variation of implementation {@code imp2}
     */
    int impl2v(int number) {
        int prev = 0;
        int curr = 1;

        if (number == 0) {
            return prev;
        }

        for (int i = 0; i < number - 1; i++) {
            int next = prev + curr;

            prev = curr;
            curr = next;
        }

        return curr;
    }

    public static void main(String[] args) {
        var fib = new JFibonacci();

        IntStream.rangeClosed(0, 9).forEach(n ->
                System.out.println(n + " number of Fibonacci is " + fib.impl2v(n))
        );
    }
}
