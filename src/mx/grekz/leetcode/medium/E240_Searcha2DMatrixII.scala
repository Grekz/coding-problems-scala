package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object Solution {
    def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
        var rs = matrix.length
        if ( rs > 0 ) {
            var ( r, c ) = ( 0, matrix(0).length -1 )
            while ( r < rs && c > -1 ) {
                var cur = matrix(r)(c)   
                if ( cur == target )
                    return true
                if ( cur < target )
                    r += 1
                else
                    c -= 1
            }
        }
        false
    }
}