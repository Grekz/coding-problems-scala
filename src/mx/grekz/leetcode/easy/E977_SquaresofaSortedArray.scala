package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E977_SquaresofaSortedArray {
    def sortedSquares(A: Array[Int]): Array[Int] = {
        val n = A.size
        var res = Array.fill(n)(0)
        for ( i <- 0 until n ) A(i) *= A(i)
        var ( i, j, k) = (0, n-1, n-1)
        while ( i <= j ) {
            if ( A(i) < A(j) ) {
                res(k) = A(j)
                j -= 1
            } else {
                res(k) = A(i)
                i += 1
            } 
            k -= 1
        }
        return res
    }
}