package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E365_WaterandJugProblem {

    def canMeasureWater(x: Int, y: Int, z: Int): Boolean = {
        return if ( x + y < z )
            false
        else if ( x == z || y == z || x + y == z )
            true
        else
            z % gcd(x, y) == 0    
    }
    def gcd( a: Int, b: Int): Int = {
        return if ( b == 0 )
            a
        else
            gcd(b, a % b)
    }
}