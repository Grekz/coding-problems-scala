package mx.grekz.leetcode.medium

object E005_LongestPalindromicSubstring {
  
    def longestPalindrome(s: String): String = {
        var t = new Array[Char](s.length()*2 + 3)
        t(0) = '$'
        t(1) = '#'
        var i = 2
        for (x <- s) {
            t(i) = x
            i += 1
            t(i) = '#'
            i += 1
        }
        t(i) = '%'
        var (p,c,r,mc,mp) = (new Array[Int](s.length()*2 + 3),0,0,0,0)
        for ( i <- 1 until t.length() - 2 ){
            if (i < r) p(i) = Math.min(r - i, p(2*c - i))
            while(t(i - (p(i) + 1)) == t(i + (p(i) + 1))) p(i) += 1
            if ( i + p(i) > r ) {
                c = i
                r = i + p(c)
                if ( p(c) > mp ){
                    mc = c
                    mp = p(c)
                }
            }
        }
        var (st, en) = ( (mc - mp) / 2, (mc + mp) / 2 )
        return s.substring(st,en)
    }
}