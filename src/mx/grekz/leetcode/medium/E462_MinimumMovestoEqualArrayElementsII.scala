package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E462_MinimumMovestoEqualArrayElementsII {

    def minMoves2(nums: Array[Int]): Int = {
        scala.util.Sorting.quickSort(nums)
        var i = 0
        var j = nums.size - 1
        var res = 0
        while (i < j) {
            res += nums(j) - nums(i)
            j -= 1
            i += 1
        }
        return res
    }
}