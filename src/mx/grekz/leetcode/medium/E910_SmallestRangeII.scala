package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E910_SmallestRangeII {
    def smallestRangeII(A: Array[Int], K: Int): Int = {
        scala.util.Sorting.quickSort(A)        
        val n = A.size - 1
        var res = A(n) - A(0)
        for ( i <- 0 until n ) {
            val a = A(i)
            val b = A(i+1)
            val h = Math.max(A(n) - K, a + K)
            val l = Math.min(A(0) + K, b - K)
            res = Math.min(res, h - l)
        }
        return res
    }
}