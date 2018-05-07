package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E830_PositionsofLargeGroups {
    def largeGroupPositions(S: String): List[List[Int]] = {
        val _s = S + "|"
        var res = List[List[Int]]()
        var ps = 0
        for ( ( x, i ) <- _s.view.zipWithIndex ) {
            if ( x != _s(ps) ) {
                if ( i - ps > 2 ) {
                    res :+= List[Int](ps, i-1)
                }
                ps = i
            }
        }
        res
    }
}