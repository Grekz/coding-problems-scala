package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E389_FindtheDifference {

    def findTheDifference(s: String, t: String): Char = {
        var r = 0
        for ( i <- s )
            r ^= i
        for ( i <- t )
            r ^= i
        r.toChar
    }
}