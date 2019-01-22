package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E746_MinCostClimbingStairs {
    def minCostClimbingStairs(cost: Array[Int]): Int = {
        val n = cost.size
        for ( i <- 2 until n)
            cost(i) += Math.min(cost(i-1), cost(i-2))
        return Math.min(cost(n-1), cost(n-2))
    }
}