package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E283_MoveZeroes {

    def moveZeroes(nums: Array[Int]): Unit = {
        var pointer = 0
        nums.zipWithIndex.foreach { case ( e,i ) => {
            if ( e != 0 ) {
                var tmp = e
                nums(i) = nums(pointer)
                nums(pointer) = tmp
                pointer += 1
            }
        }}
    }
}