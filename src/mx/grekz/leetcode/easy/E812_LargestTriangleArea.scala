package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E812_LargestTriangleArea {
    def largestTriangleArea(points: Array[Array[Int]]): Double = {
        var res = 0.0
        for ( i <- points; j <- points; k <- points ) {
            res = Math.max(res, 0.5 * Math.abs(i(0) * j(1) + j(0) * k(1) + k(0) * i(1) - j(0) * i(1) - k(0) * j(1) - i(0) * k(1)))
        }
        res
    }
}