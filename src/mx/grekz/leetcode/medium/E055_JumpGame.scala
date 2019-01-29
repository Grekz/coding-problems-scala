package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E055_JumpGame {
    def canJump(nums: Array[Int]): Boolean = {
        var last = nums.size - 1
        for ( i <- last to 0 by -1)
            if ( i + nums(i) >= last )
                last = i
        last == 0
    }
}