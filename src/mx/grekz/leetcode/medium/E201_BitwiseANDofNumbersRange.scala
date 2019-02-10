package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E201_BitwiseANDofNumbersRange {

    def rangeBitwiseAnd(m: Int, _n: Int): Int = {
        var n = _n
        while ( m < n ) n &= (n-1)
        return n
    }
}