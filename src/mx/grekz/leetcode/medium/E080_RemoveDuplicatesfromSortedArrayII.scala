package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E080_RemoveDuplicatesfromSortedArrayII {

    def removeDuplicates(nums: Array[Int]): Int = {
        if ( nums.length < 3 )
            nums.length
        else {
            var i = 0
            for ( n <- nums ) {
                if ( i < 2 || nums(i-2) < n ) {
                    nums(i) = n
                    i += 1
                }
            }
            i
        }
    }
}