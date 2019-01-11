package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E896_MonotonicArray {
    def isMonotonic(A: Array[Int]): Boolean = {
        var ( a, b ) = (true, true)
        for ( i <- 1 until A.size ) {
            a = a && A(i - 1) <= A(i)
            b = b && A(i - 1) >= A(i)
        }
        a || b
    }
}