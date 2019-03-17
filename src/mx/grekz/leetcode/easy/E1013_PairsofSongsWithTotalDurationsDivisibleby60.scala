package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E1013_PairsofSongsWithTotalDurationsDivisibleby60 {
    def numPairsDivisibleBy60(time: Array[Int]): Int = {
        var res = 0 
        var cnt = Array.fill(60)(0)
        for ( x <- time ) {
            val d = (60 - x % 60) % 60
            res += cnt(d)
            cnt(x%60) += 1
        }
        return res
    }
}