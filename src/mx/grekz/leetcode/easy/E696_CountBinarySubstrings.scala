package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E696_CountBinarySubstrings {
    def countBinarySubstrings(s: String): Int = {
        var a = 0
        var p = 0
        var c = 1
        var n = s.size - 1
        for ( i <- 1.to(n) )
            if ( s.charAt(i) != s.charAt(i-1) ) {
                a += Math.min(p, c)
                p = c
                c = 1
            }else{
                c += 1
            }
        return a + Math.min(p, c)
    }
}