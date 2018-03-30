package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E561_ArrayPartitionI {
    def arrayPairSum(nums: Array[Int]): Int = {
        nums.sortWith(_ < _).zipWithIndex.collect {case (e,i) if ((i) % 2) == 0 => e}.sum
    }
}