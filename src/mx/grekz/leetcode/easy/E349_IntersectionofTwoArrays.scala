package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E349_IntersectionofTwoArrays {
    def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
        nums1.toSet.intersect(nums2.toSet).toArray
    }
}