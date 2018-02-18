package mx.grekz.leetcode.easy

object E171_ExcelSheetColumnNumber {
    def titleToNumber(s: String): Int = {
        var res = 0
        for ( i <- 0 until s.length() )
            res = res * 26 - 64 + s(i).toInt
        res
    }
  
}