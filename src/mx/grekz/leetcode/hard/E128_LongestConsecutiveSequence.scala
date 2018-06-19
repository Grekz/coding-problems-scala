package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
object E128_LongestConsecutiveSequence {

    def longestConsecutive(nums: Array[Int]): Int = {
        var ( s, res ) = ( nums.toSet, 0 )
        for ( x <- nums ) {
            if ( !s.contains( x - 1 ) ) {
                var y = x + 1
                while ( s.contains(y) ) y += 1
                res = Math.max(res, y - x)
            }    
        }
        res
    }
}