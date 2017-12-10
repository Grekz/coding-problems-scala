package mx.grekz.leetcode.medium

object E011_ContainerWithMostWater {
    def maxArea(height: Array[Int]): Int = {
        val len = height.size
        if ( len < 2 )
            return 0
        var ( l, h, res ) = ( 0, len - 1, 0 )
        while ( l < h ) {
            res = Math.max(res, Math.min(height(l), height(h)) * ( h-l ) )
            if ( height(l) < height(h) )
                l += 1
            else
                h -= 1
        }
        return res
    }  
}