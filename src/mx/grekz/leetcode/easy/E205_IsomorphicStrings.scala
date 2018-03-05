package mx.grekz.leetcode.easy

object E205_IsomorphicStrings {
    def isIsomorphic(s: String, t: String): Boolean = {
        val n = s.length
        if ( n != t.length ) return false
        var a = Array.fill[Int](256)(-1)
        var b = Array.fill[Int](256)(-1)
        for ( i <- 0 to n - 1 ) {
            val si = s(i)
            val ti = t(i)
            if ( a(si) != b(ti) ) return false
            a(si) = i
            b(ti) = i
        }
        true
    }
}