package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E463_IslandPerimeter {
    def islandPerimeter(grid: Array[Array[Int]]): Int = {
        var ( la, lb, isla, neig ) = ( grid.length, grid(0).length, 0, 0 )
        for ( i <- 0 until la ) {
            for ( j <- 0 until lb ) {
                if ( grid(i)(j) == 1 ) {
                    isla += 1
                    if ( i < la - 1 && grid(i+1)(j) == 1 )
                        neig += 1
                    if ( j < lb - 1 && grid(i)(j+1) == 1 )
                        neig += 1
                }
            }
        }
        isla * 4 - neig * 2
    }
}