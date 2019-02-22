package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E858_MirrorReflection {

    def mirrorReflection(_p: Int, _q: Int): Int = {
        var p = _p
        var q = _q
        var g = gcd(p, q)
        p /= g
        p %= 2
        q /= g
        q %= 2
        if ( p == 1 && q == 1 )
            return 1
        if ( p == 1 )
            return 0
        return 2
    }
    def gcd ( a: Int, b: Int ): Int = {
        if ( a == 0 )
            return b
        return gcd( b % a, a)
    }
}