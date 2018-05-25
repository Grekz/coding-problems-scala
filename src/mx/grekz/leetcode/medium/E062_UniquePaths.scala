package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E062_UniquePaths {
    def uniquePaths(m: Int, n: Int): Int = {
        var res :Long = 1
        for ( i <- 1 until m )
            res = res * ( i + n - 1 ) / i
        res.toInt
    }
}