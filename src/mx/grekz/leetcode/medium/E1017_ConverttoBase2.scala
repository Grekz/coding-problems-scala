package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E1017_ConverttoBase2 {
    def baseNeg2(N: Int): String = {
        var res = ""
        var n = N
        while ( n != 0) {
            res = ( n & 1) + res
            n = -( n >> 1)
        }
        return if ( res.size > 0 ) res else "0"
    }
}