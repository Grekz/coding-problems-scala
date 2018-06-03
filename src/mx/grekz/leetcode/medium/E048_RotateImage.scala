package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E048_RotateImage {
    def rotate(matrix: Array[Array[Int]]): Unit = {
        var n = matrix.length
        for ( i <- 0 until n; j <- i + 1 until n ) {
            var t = matrix(i)(j)
            matrix(i)(j) = matrix(j)(i)
            matrix(j)(i) = t
        }
        for ( i <- 0 until n ) {
            matrix(i) = matrix(i).reverse
        }
    }
}