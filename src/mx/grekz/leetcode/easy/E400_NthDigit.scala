package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E400_NthDigit {

    def findNthDigit( _n: Int): Int = {
        if ( _n < 10 ) { 
            return _n
        }
        var n = _n - 1
        var digitInNumber = 1
        var range = 1
        while (n / 9 / range / digitInNumber >= 1) {
            n -= 9 * range * digitInNumber
            digitInNumber+=1
            range *= 10
        }
        (range + n/digitInNumber + "").charAt(n%digitInNumber) - '0'
    }
}