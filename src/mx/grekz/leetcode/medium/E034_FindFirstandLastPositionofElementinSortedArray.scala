package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E034_FindFirstandLastPositionofElementinSortedArray {
    def searchRange(nums: Array[Int], target: Int): Array[Int] = {
        if ( nums == null || nums.size < 1 ) return Array[Int](-1,-1)
        val idx = bSearch(nums, target, true)
        if ( nums(idx % nums.size) != target ) return Array[Int](-1,-1)
        val rIdx = bSearch(nums, target, false) - 1
        return Array[Int](idx, rIdx)
    }
    def bSearch(n: Array[Int], t: Int, l: Boolean): Int = {
        var ( a, b, m ) = (0, n.size, 0)
        while ( a < b ) {
            m = a + ( b - a ) / 2
            if ( n(m) > t || ( l && n(m) == t ) ) {
                b = m
            }else{
                a = m + 1
            }
        }
        return a
    }
}