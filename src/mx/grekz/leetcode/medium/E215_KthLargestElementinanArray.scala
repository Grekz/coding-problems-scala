package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E215_KthLargestElementinanArray {
    def findKthLargest(nums: Array[Int], k: Int): Int = nums.sorted.toList(nums.size - k)
}