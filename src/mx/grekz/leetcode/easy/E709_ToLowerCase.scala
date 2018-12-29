package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E709_ToLowerCase {
    def toLowerCase(str: String): String = {
        str.map( c => if ( 65 <= c && c <= 90 ) (c + 32).toChar else c )
    }
}