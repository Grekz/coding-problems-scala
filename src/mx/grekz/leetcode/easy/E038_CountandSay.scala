package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E038_CountandSay {

    def countAndSay(n: Int): String = {
        if ( n < 1 ) return "0";
        if ( n == 1 ) return "1";
        if ( n == 2 ) return "11";
        if ( n == 3 ) return "21";
        var arr = countAndSay( n - 1 )
        var cur = ' '
        var count = 0
        var res = ""
        for ( x <- arr ) {
            if ( cur != x ) {
                if (count > 0)
                    res += count.toString + "" + cur
                count = 1
                cur = x
            }else
                count+=1
        }
        res += count.toString + "" + cur        
        return res
    }
}