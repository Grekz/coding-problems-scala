package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E1018_BinaryPrefixDivisibleBy5 {
    def prefixesDivBy5(A: Array[Int]): Array[Boolean] = {
        var tmp = 0
        var i = 0
        var res = Array.fill(A.size)(false)
        for ( x <- A ) {
            tmp = ( ( tmp << 1 ) + x ) % 5
            res(i) = tmp == 0
            i += 1
        }
        return res
    }
}