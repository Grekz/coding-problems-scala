package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E856_ScoreofParentheses {
    def scoreOfParentheses(S: String): Int = {
        var bal = 0
        var res = 0
        var prev = 0
        for ( c <- S.toCharArray() ) {
            if ( c == '(' )
                bal+=1
            else {
                bal-=1
                if ( prev == '(') {
                    res += 1 << bal
                }
            }
            prev = c
        }
        return res
    }
}