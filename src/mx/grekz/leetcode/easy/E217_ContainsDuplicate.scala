package mx.grekz.leetcode.easy

object E217_ContainsDuplicate {
    def containsDuplicate(nums: Array[Int]): Boolean = nums.length != nums.toSet.size

}