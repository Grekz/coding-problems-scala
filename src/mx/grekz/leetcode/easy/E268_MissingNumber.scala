package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E268_MissingNumber {
    def missingNumber(nums: Array[Int]): Int = (0 to nums.length).sum - nums.sum
}