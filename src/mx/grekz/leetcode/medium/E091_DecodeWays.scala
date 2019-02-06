package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E091_DecodeWays {
    def numDecodings(s: String): Int = {
        if ( s.length() < 1 || s.charAt(0) == '0' )
            0
        else {
            var res = Array.fill(s.length()+1)(0)
            res(1) = 1
            res(0) = 1
            for ( i <- 2 to s.length() ) {
                var a = s.charAt(i-2)
                var b = s.charAt(i-1)
                if ( b != '0' ) {
                    res(i) = res(i-1)
                }
                if ( a == '1' || ( a == '2' && b < '7' ) ) {
                    res(i) += res(i-2)
                }
            }
            res(s.length())
        }
    }
}