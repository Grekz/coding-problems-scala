package mx.grekz.leetcode.easy

object E168_ExcelSheetColumnTitle {
    def convertToTitle(_n: Int): String = {
        if ( _n == 0 )
            return ""
        var res = ""
        var n = _n
        while ( n > 0 ) {
            n -= 1
            res = ( 'A' + n%26 ).toChar + res
            n /= 26
        }
        return res
    }
}