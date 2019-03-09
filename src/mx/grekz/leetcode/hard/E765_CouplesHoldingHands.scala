package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
object E765_CouplesHoldingHands {
    def minSwapsCouples(row: Array[Int]): Int = {
        val n = row.size
        var res = 0
        var pos = Array.fill(n)(0)
        for ( i <- 0.until(n) )
            pos(row(i)) = i
        for ( i <- 0.until(n).by(2) ) {
            val pair = row(i) ^ 1
            if ( pair != row(i + 1) ) {
                row(pos(pair)) = row(i+1)
                pos(row(i+1)) = pos(pair)
                res += 1
            }
        }
        return res
    }
}