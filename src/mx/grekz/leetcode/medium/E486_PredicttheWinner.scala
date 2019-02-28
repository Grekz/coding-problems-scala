package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E486_PredicttheWinner {
    def PredictTheWinner(nums: Array[Int]): Boolean = {
        val n = nums.size
        var dp = Array.fill(n)(0)
        for ( i <- n to 0 by -1; j <- i + 1 until n ) {
            val a = nums(i) - dp(j)
            val b = nums(j) - dp(j - 1)
            dp(j) = Math.max(a, b)
        }
        return dp(n-1) >= 0
    }
}