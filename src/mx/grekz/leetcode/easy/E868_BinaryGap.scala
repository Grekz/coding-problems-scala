package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E868_BinaryGap {
    def binaryGap(N: Int): Int = {
        var res = 0
        var l = -1
        for ( i <- 0 until 32) {
            if ( ( ( N >> i ) & 1 ) > 0 ) {
                if ( l >= 0 ) {
                    res = Math.max(res, i - l)
                }
                l = i
            }
        }
        return res
    }
}