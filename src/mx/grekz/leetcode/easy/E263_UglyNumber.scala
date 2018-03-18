package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E263_UglyNumber {

    def isUgly(num: Int): Boolean = {
        if (num == 0 || num == 14) return false;
        if (num == 1 || num == 6 || num == 8) return true;
        if ( num % 5 == 0) return isUgly(num / 5);
        if ( num % 3 == 0) return isUgly(num / 3);
        if ( num % 2 == 0) return isUgly(num / 2);
        return false;
    }
}