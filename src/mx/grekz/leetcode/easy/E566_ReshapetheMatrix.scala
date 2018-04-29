package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E566_ReshapetheMatrix {
    def matrixReshape(nums: Array[Array[Int]], r: Int, c: Int): Array[Array[Int]] = {
        var n = nums.length
        var m = nums(0).length
        if ( n * m != r * c ) {
            return nums
        }
        var res = Array.ofDim[Int](r, c)
        var i = 0
        for ( curArr <- nums; cur <- curArr ) {
            res(i/c)(i%c) = cur
            i += 1
        }
        res
    }
}