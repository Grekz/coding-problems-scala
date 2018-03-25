package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E367_ValidPerfectSquare {
    def isPerfectSquare(num: Int): Boolean = {
        var r = BigInt(num)
        while ( r*r > num ) {
            r = ( r + num / r ) / 2
        }
        return r*r == num
    }
}