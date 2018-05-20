package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E836_RectangleOverlap {
    def isRectangleOverlap(rec1: Array[Int], rec2: Array[Int]): Boolean = {
        Math.max(rec1(0), rec2(0)) < Math.min(rec1(2), rec2(2)) && Math.max(rec1(1), rec2(1)) < Math.min(rec1(3), rec2(3))   
    }
}