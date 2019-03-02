package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E540_SingleElementinaSortedArray {
    def singleNonDuplicate(nums: Array[Int]): Int = {
        var i = 0
        var j = nums.size - 1
        while ( i < j ) {
            val mid = i + ( j - i ) / 2
            if ( nums(mid) == nums(mid ^ 1) )
                i = mid + 1
            else
                j = mid
        }
        return nums(i)
    }
}