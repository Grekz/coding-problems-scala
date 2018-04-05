package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E409_LongestPalindrome {
    def longestPalindrome(s: String): Int = {
        var res = 0
        var tmp = Array.fill[Boolean](58)(false)
        for ( c <- s ) {
            val t = c - 65
            if (tmp(t))
                res += 2
            tmp(t) = !tmp(t)
        }
        if (res == s.length) res else res+1
    }
}