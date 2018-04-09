package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E443_StringCompression {
    def compress(chars: Array[Char]): Int = {
        var ( ind, ans, n ) = ( 0, 0, chars.length )
        while ( ind < n ) {
            val c = chars(ind)
            var cc = 0
            while ( ind < n && c == chars(ind) ) {
                ind += 1
                cc += 1
            }
            chars(ans) = c
            ans += 1
            if ( cc > 1 ) {
                for ( x <- "" + cc ) {
                    chars(ans) = x
                    ans += 1
                }
            }
        }
        ans
    }
}