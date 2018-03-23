package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E345_ReverseVowelsofaString {
    def reverseVowels(s: String): String = {
        if ( s.length < 2 ) return s
        def check(c: Char): Boolean = !("aeiouAEIOU".contains(c))
        var arr = s.toArray
        var i = 0
        var j = s.length - 1
        while ( i < j ) {
            while ( i < j && check(arr(i)) ) i+=1
            while ( i < j && check(arr(j)) ) j-=1
            if ( i < j ) {
                var tmp = arr(i)
                arr(i) = arr(j)
                arr(j) = tmp
            }
            i+=1
            j-=1
        }
        arr.mkString("")
    }
}