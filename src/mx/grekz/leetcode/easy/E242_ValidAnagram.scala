package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E242_ValidAnagram {
    def isAnagram(s: String, t: String): Boolean = {
        if(s.length() != t.length() ) return false
        var tmp = Array.fill[Int](26)(0)
        t.foreach( c => tmp(c - 'a') += 1 )
        s.foreach( c => tmp(c - 'a') -= 1 )
        tmp.forall(_ == 0)
    }
}