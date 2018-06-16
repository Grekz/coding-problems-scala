package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E849_MaximizeDistancetoClosestPerson {

    def maxDistToClosest(seats: Array[Int]): Int = {
        var ( i, j, res, n) = ( 0, 0, 0, seats.length )
        for ( cur <- seats ) {
            if ( cur == 1 ) {
                if ( i == 0 )
                    res = Math.max(res, j - i)
                else
                    res = Math.max(res, ( j - i + 1 ) / 2)
                i = j + 1
            }
            j+=1
        }
        Math.max(res, n - i)
    }
}