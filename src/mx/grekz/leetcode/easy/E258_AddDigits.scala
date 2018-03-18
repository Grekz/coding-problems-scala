package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E258_AddDigits {

    def addDigits(num: Int): Int = {
        if(num < 10) return num;
        return 1 + ( num - 1 ) % 9;
    }
}