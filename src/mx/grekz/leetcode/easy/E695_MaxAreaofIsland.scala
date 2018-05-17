package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E695_MaxAreaofIsland {
    def maxAreaOfIsland(grid: Array[Array[Int]]): Int = {
        var ma = 0
        var n = grid.length
        var m = grid(0).length
        def doit(x :Int, y :Int) : Int = {
            if ( x < 0 || y < 0 || x >= n || y >= m || grid(x)(y) == 0) {
                0
            }else{
                grid(x)(y) = 0
                1 + doit(x-1,y) + doit(x+1,y) + doit(x,y-1) + doit(x,y+1)
            }
        }
        for ( (x, i) <- grid.zipWithIndex )
            for ( (y, j) <- x.zipWithIndex )
                if ( y == 1 ) 
                    ma = Math.max(ma, doit(i,j))
        ma
    }
}