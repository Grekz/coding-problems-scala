package mx.grekz.leetcode.easy

object E009_PalindromeNumber {
    def isPalindrome(x: Int): Boolean = {
        if ( x == 0 ) return true
        if ( x < 0 || x % 10 == 0 ) return false
        return x.toString.reverse == x.toString
    }
}