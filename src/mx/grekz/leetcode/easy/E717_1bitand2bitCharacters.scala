package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E717_1bitand2bitCharacters {

    def isOneBitCharacter(bits: Array[Int]): Boolean = {
        val n = bits.length - 1
        if ( n < 1 ) return true
        for ( i <- n -1 to 0 by -1) {
            if ( bits(i) == 0 )
                return ( n - i ) % 2 == 1
        }
        ( n - 1 ) % 2 == 1
    }
}