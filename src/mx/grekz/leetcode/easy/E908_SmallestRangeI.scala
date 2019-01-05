package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E908_SmallestRangeI {
    def smallestRangeI(A: Array[Int], K: Int): Int = {
        Math.max(0, A.max - A.min - 2 * K)
    }
}