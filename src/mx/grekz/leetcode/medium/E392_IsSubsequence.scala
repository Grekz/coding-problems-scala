package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E392_IsSubsequence {
    def isSubsequence(s: String, t: String): Boolean = {
        var idx = -1
        for ( c <- s ) {
            idx = t.indexOf(c, idx + 1)
            if ( idx == -1 )
                return false
        }
        return true
    }
}