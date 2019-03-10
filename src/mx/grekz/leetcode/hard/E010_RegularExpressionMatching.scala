package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
object E010_RegularExpressionMatching {
    def isMatch(s: String, p: String): Boolean = {
        val tn = s.size
        val pn = p.size
        var dp = Array.fill(tn+1, pn+1)(false)
        dp(tn)(pn) = true
        for ( i <- tn to 0 by -1 ) {
            for ( j <- pn - 1 to 0 by -1 ) {
                val fm = i < tn && ( s(i) == p(j) || p(j) == '.' )
                if ( j + 1 < pn && p(j+1) == '*' )
                    dp(i)(j) = dp(i)(j+2) || fm && dp(i+1)(j)
                else
                    dp(i)(j) = fm && dp(i+1)(j+1)
            }
        }
        return dp(0)(0)
    }
}