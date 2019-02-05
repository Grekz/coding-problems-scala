package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E357_CountNumberswithUniqueDigits {

    def countNumbersWithUniqueDigits(n: Int): Int = {
        if ( n == 0 ) 1
        else if ( n == 1 ) 10
        else if ( n == 2 ) 91
        else if ( n > 10 ) 0
        else {
            var res = 10
            var t = 9
            for ( i <- 1 until n ){
                t *= 10 - i
                res += t
            }
            res
        }
    }
}