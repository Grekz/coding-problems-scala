package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E342_PowerofFour {
    def isPowerOfFour(num: Int): Boolean = {
        if ( num < 1 ) return false
        var n = num
        while ( n % 4 == 0 ) {
            n /= 4
        }
        n == 1
    }
    //if(n<=0) false else (n&(n-1))==0 && ((n&0x55555555))!=0
}