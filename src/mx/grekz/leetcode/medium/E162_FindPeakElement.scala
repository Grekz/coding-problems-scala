package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E162_FindPeakElement {

    def findPeakElement(nums: Array[Int]): Int = {
        var ( l, h ) = ( 0, nums.length - 1 )
        while ( l < h ) {
            var m = ( l + h ) / 2
            if ( nums(m) < nums(m + 1) )
                l = m + 1
            else
                h = m
        }
        l
    }
}