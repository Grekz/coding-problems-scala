package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E459_RepeatedSubstringPattern {

    def repeatedSubstringPattern(s: String): Boolean = {
        (s+s).drop(1).dropRight(1).contains(s)
    }
}