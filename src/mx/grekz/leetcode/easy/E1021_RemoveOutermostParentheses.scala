package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E1021_RemoveOutermostParentheses {
    def removeOuterParentheses(S: String): String = {
        var c = 0
        var res = ""
        for ( x <- S ){
            if (x == '('){
                if ( c > 0 )
                    res += x
                c += 1
            }                
            if (x == ')') {
                if (c > 1) 
                    res += x
                c -= 1
            }
        }
        return res
    }
}