package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E628_MaximumProductofThreeNumbers {

    def maximumProduct(xNums: Array[Int]): Int = {
        var nums = xNums.sorted
        var n = nums.length - 1
        Math.max(nums(n) * nums(n-1) * nums(n-2), nums(0) * nums(1) * nums(n))
    }
}