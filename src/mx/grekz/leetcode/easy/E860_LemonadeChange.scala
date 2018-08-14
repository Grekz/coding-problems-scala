package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E860_LemonadeChange {
    def lemonadeChange(bills: Array[Int]): Boolean = {
        var ( f, t ) = ( 0, 0 )
        for ( x <- bills ) {
            if ( x == 5 ) {
                f += 1
            }else if ( x == 10 ) {
                t += 1
                f -= 1
            }else if ( t > 0 ) {
                t -= 1
                f -= 1
            }else {
                f -= 3
            }
            if ( f < 0 ) {
                return false
            }
        }
        return true
    }
}