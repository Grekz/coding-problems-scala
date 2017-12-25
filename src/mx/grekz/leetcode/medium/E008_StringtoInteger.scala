package mx.grekz.leetcode.medium

object E008_StringtoInteger {
    def myAtoi(str1: String): Int = {
        var str = str1.trim
        if ( str.length() < 1 )
            return 0
        var z = '0'
        var n = '9'
        var sign = '+'
        var res = ""
        var con = true
        if ( str(0) == '-' || str(0) == '+' ) {
            sign = str(0)
            str = str.substring(1)            
        }
        for ( x <- str )
            if ( con && x >= z && x <= n )
                res += x
            else
                con = false
        if ( res != "" ) {
            var resInt = ( sign + res ).toDouble
            if ( resInt > 2147483647 ) return 2147483647
            if ( resInt < -2147483648 ) return -2147483648
            return resInt.toInt            
        }       
        return 0
    }
}