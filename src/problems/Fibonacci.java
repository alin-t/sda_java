package problems;

/**
 * User: alin-lucian.taranu
 * Date: 10/14/13
 * Time: 4:20 PM
 */
public class Fibonacci {
    static long fib(int n) {
        return n <= 1 ? n : fib(n - 2) + fib(n - 1);
    }
}
