package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E0674_LongestContinuousIncreasingSubsequence {
    def findLengthOfLCIS(nums: Array[Int]): Int = {
        var res = 0
        var count = 0
        for ( i <- 0 until nums.size ) { 
            if ( i < 1 || nums(i-1) < nums(i) ) {
                count += 1
                res = Math.max(res, count)
            } else {
                count = 1  
            }
        }
        return res
    }
}