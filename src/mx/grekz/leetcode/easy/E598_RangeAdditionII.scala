package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E598_RangeAdditionII {
    def maxCount(m: Int, n: Int, ops: Array[Array[Int]]): Int = {
        var a = m
        var b = n
        for ( x <- ops ) {
            a = Math.min(a, x(0))
            b = Math.min(b, x(1))
        }
        a * b
    }
}