package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E844_BackspaceStringCompare {
    def backspaceCompare(S: String, T: String): Boolean = {
        doit(S) == doit(T)
    }
    def doit( S: String): String = {
        var ( res, n, c, h ) = ("", S.length - 1, 0, '#' )
        for ( i <- n to 0 by -1 ) {
            var cur = S(i)
            if ( cur == h )
                c += 1
            else if ( c > 0 ) 
                c -= 1
            else
                res += cur
        }
        res
    }
}