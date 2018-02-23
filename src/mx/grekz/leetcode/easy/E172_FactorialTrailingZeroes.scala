package mx.grekz.leetcode.easy

object E172_FactorialTrailingZeroes {
  
    def trailingZeroes(n: Int): Int = {
        var res = 0
        var _n = n
        while ( _n > 0 ) {
            _n /= 5
            res += _n
        }
        res
    }
}