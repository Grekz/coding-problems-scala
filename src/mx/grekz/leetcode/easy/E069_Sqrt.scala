package mx.grekz.leetcode.easy

object E069_Sqrt {
    def mySqrt(x: Int): Int = {
        var r = x.toLong
        while ( r * r > x ) {
            r = ( r + x / r ) / 2
        }
        return r.toInt
    }
}