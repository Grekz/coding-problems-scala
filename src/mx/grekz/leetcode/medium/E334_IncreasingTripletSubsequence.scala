package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E334_IncreasingTripletSubsequence {
    def increasingTriplet(nums: Array[Int]): Boolean = {
        var ( a, b ) = (2147483647, 2147483647)
        for ( x <- nums ) {
            if ( x <= a )
                a = x
            else if ( x <= b )
                b = x
            else
                return true
        }
        false
    }
}