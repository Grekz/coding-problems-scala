package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E507_PerfectNumber {
    def checkPerfectNumber(num: Int): Boolean = {
        if ( num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336 ){
            return true
        }
        false
    }
}