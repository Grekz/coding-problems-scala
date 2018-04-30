package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E824_GoatLatin {

    def toGoatLatin(S: String): String = {
        val vowels = "aeiouAEIOU"
        var res = ""
        var i = 1
        for (  c <- S.split(" ") ) {
            res += " "
            val curChar = c.charAt(0)
            if ( vowels.contains(curChar) ) {
                res += c
            }else{
                res += c.substring(1) + c.charAt(0) 
            }
            res += "ma"
            for ( j <- 0 until i ) {
                res += "a"
            }
            i += 1
        }
        return res.substring(1)
    }
}