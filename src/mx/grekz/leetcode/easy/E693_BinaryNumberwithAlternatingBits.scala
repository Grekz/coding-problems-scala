package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E693_BinaryNumberwithAlternatingBits {
    def hasAlternatingBits(n: Int): Boolean = {
        val b = Integer.toString(n,2)
        !b.contains("11") && !b.contains("00")
    }
}