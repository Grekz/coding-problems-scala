package mx.grekz.leetcode.easy

object E013_RomantoInteger {
    def romanToInt(s: String): Int = {
        val m = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
        var res = 0
        var i = 0
        val len = s.size - 1
        for ( c <- s.slice(0,len) ){
            val cur = m(c)
            i += 1
            res += ( if ( cur < m(s(i) ) ) -1 else 1 ) * cur
        }
        return res + m(s.last)
    }
}