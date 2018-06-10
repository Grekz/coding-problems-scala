package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E807_MaxIncreasetoKeepCitySkyline {

    def maxIncreaseKeepingSkyline(grid: Array[Array[Int]]): Int = {
        var ( n, m, res ) = ( grid.length, grid(0).length, 0 )
        var r = Array.fill[Int](n)(0)
        var c = Array.fill[Int](m)(0)
        for ( ( x, i ) <- grid.zipWithIndex )
            for ( ( y, j ) <- x.zipWithIndex ) {
                if ( r(i) < y )
                    r(i) = y
                if ( c(j) < y )
                    c(j) = y
            }
        for ( ( x, i ) <- grid.zipWithIndex )
            for ( ( y, j ) <- x.zipWithIndex )
                res += Math.min( c(j), r(i) ) - y
        return res
    }   
}