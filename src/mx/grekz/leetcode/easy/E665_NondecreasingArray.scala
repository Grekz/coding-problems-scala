package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E665_NondecreasingArray {
    def checkPossibility(nums: Array[Int]): Boolean = {
        var n = nums.length
        var exists = false
        for ( i <- 1 until n ) {
            if ( nums(i) < nums(i-1) ) {
                if ( exists ) {
                    return false
                }
                exists = true
                if ( i >= 2 && nums(i) < nums(i-2) ) {
                    nums(i) = nums(i-1)
                }
            }
        }
        true
    }
}