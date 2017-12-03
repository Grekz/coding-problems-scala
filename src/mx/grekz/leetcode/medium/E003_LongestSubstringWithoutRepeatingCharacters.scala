package mx.grekz.leetcode.medium

object E003_LongestSubstringWithoutRepeatingCharacters {
    def lengthOfLongestSubstring( s: String ): Int = {
        var ( prev, res, i ) = ( 0, 0, 0 )
        var dict = Map[ Char, Int ]()
        for ( c <- s ) {
            if ( dict.contains( c ) && dict( c ) >= prev ) {
                res = Math.max( res, i - prev )
                prev = dict( c ) + 1
            }
            dict += ( c -> i )
            i += 1
        }
        if ( res < i - prev ) {
            return i - prev
        }
        return res
    }
}