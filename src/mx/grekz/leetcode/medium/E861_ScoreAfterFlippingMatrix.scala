package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E861_ScoreAfterFlippingMatrix {

    def matrixScore(A: Array[Array[Int]]): Int = {
        var rows = A.size
        var cols = A(0).size
        var ans = 0
        for ( c <- 0 until cols ) {
            var col = 0
            for ( r <- 0 until rows ) {
                col += A(r)(c) ^ A(r)(0)
            }
            ans += Math.max(col, rows - col) * ( 1 << ( cols - c - 1 ) )
        }
        return ans
    }
}