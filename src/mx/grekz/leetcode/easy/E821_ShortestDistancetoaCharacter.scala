package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E821_ShortestDistancetoaCharacter {

    def shortestToChar(S: String, C: Char): Array[Int] = {
        val n = S.length()
        var pos = -n
        var res = Array.fill(n)(0)
        for ( i <- 0 until n ) {
            if ( S(i) == C )
                pos = i
            else
                res(i) = i - pos
        }
        for ( i <- n-1 to 0 by -1 ) {
            if ( S(i) == C )
                pos = i
            else
                res(i) = Math.min(res(i), Math.abs(i - pos))
        }
        res
    }
}