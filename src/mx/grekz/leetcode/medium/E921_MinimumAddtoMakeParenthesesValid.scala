package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E921_MinimumAddtoMakeParenthesesValid {
    def minAddToMakeValid(S: String): Int = {
        var res = 0
        var bal = 0
        for ( x <- S ){
            bal += (if ( x == '(' ) 1 else -1)
            if ( bal == -1 ) {
                bal = 0
                res += 1
            }     
        }
        return bal + res
    }
}