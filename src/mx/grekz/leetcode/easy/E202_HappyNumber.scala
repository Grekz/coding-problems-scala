package mx.grekz.leetcode.easy

object E202_HappyNumber {
    def isHappy(_n: Int): Boolean = {
        if ( _n < 1 || _n == 4 ) return false
        if ( Array(1,7,10,13,19,23) contains _n ) return true
        var res = 0
        var n = _n
        while ( n > 0 ) {
            res += n%10 * (n%10)
            n /= 10
        }
        return isHappy(res)
    }
}