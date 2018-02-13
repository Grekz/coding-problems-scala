package mx.grekz.leetcode.easy

object E125_ValidPalindrome {
    def isPalindrome(s: String): Boolean = {
        var i = 0
        var j = s.length - 1
        val cs = (('a' to 'z') ++ ('A' to 'Z') ++ ('0' to '9')).toSet
        while( i < j ) {
            while (i<j && !cs.contains(s(i)))
                i+=1
            while (i<j && !cs.contains(s(j)))
                j-=1
            if ( s(i).toLower != s(j).toLower )
                return false
            i+=1
            j-=1
        }
        return true
        // val alphanumeric = s.filter(_.isLetterOrDigit).toLowerCase
        // alphanumeric == alphanumeric.reverse
    }
}