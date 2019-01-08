package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E509_FibonacciNumber {
    def fib(N: Int): Int = if ( N < 2 ) N else fib(N-1) + fib(N-2)
}