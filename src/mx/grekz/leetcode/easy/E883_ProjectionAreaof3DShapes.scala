package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E883_ProjectionAreaof3DShapes {
    def projectionArea(grid: Array[Array[Int]]): Int = {
        var n = grid.size - 1
        var res = 0
        for ( i <- 0 to n ) {
            var col = 0
            var row = 0
            for ( j <- 0 to n ) {
                if ( grid(i)(j) > 0 ) {
                    res += 1 
                }
                row = Math.max(grid(i)(j), row)
                col = Math.max(grid(j)(i), col)
            }
            res += col + row
        }
        return res
    }
}