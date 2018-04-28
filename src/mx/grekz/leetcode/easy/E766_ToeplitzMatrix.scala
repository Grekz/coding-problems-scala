package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E766_ToeplitzMatrix {
    def isToeplitzMatrix(matrix: Array[Array[Int]]): Boolean = {
        val m = matrix.length - 1
        val n = matrix(0).length - 1
        for ( i <- 0 until m; j <- 0 until n ) {
            if ( matrix(i)(j) != matrix(i+1)(j+1) ){
                return false
            }
        }
        true
    }
}