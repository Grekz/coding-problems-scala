package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E387_FirstUniqueCharacterinaString {

    def firstUniqChar(s: String): Int = {
        var res = s.length
        for ( c <- "abcdefghijklmnopqrstuvwxyz" ) {
            var lInd = s.indexOf(c)
            if ( lInd != -1 && lInd == s.lastIndexOf(c) && res > lInd ) {
                res = lInd
            }
        }
        if ( res == s.length ) -1 else res
    }
}