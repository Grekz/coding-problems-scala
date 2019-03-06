package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E287_FindtheDuplicateNumber {
    def findDuplicate(nums: Array[Int]): Int = {
        val n = nums.size
        for ( i <- 0.until(n) ) {
            val cur = Math.abs(nums(i)) - 1
            if ( nums(cur) < 0 )
                return cur + 1
            nums(cur) = -nums(cur) 
        }
        return -1
    }
}