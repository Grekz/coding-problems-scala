package mx.grekz.leetcode.easy

object E007_ReverseInteger {
    def reverse(x: Int): Int = {
        val s = if ( x < 0 ) -1L else 1L
        var _x = s * x
        var r = _x.toString.reverse.toLong
        if (r > Int.MaxValue )
            return 0
        return (r * s).toInt
    }
}