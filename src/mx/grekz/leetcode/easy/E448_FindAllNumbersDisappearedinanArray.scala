package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E448_FindAllNumbersDisappearedinanArray {

    def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
        List.range(1,nums.length+1) diff nums
    }
}