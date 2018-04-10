package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E453_MinimumMovestoEqualArrayElements {
    def minMoves(nums: Array[Int]): Int = {
        val m = nums.reduce(_ min _)
        var res = 0
        for ( i <- nums ) {
            res += i - m
        }
        res
    }
}