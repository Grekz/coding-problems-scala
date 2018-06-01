package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E238_ProductofArrayExceptSelf {
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        var ( t, n ) = ( 1, nums.length )
        var p = new Array[Int](n)
        for ( ( e, i ) <- nums.zipWithIndex ) {
            p(i) = t
            t *= e
        }
        t = 1
        for ( ( e, i ) <- nums.zipWithIndex.reverse ) {
            p(i) *= t
            t *= e
        }
        p
    }
}