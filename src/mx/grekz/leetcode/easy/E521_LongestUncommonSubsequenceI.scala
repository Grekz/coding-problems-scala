package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E521_LongestUncommonSubsequenceI {
    def findLUSlength(a: String, b: String): Int = {
        if ( a == b ) -1 else Math.max(a.length, b.length) 
    }
}