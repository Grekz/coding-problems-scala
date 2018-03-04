package mx.grekz.leetcode.easy

object E405_ConvertaNumbertoHexadecimal {
  
    def toHex(_num: Int): String = {
        if ( _num == 0 ) return "0"
        var num = _num
        val cc = Array('0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f')
        var res = ""
        while ( num != 0 ) {
            res = cc(num&15) + res
            num >>>=4
        }
        res
    }
}