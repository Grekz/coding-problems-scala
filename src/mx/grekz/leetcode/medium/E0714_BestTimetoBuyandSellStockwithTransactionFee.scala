package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E0714_BestTimetoBuyandSellStockwithTransactionFee {
    def maxProfit(prices: Array[Int], fee: Int): Int = {
        var a = 0
        var b = -2147483648
        var c = 0
        for (x <- prices) {
            c = a
            a = Math.max( a, b + x )
            b = Math.max( b, c - fee - x)
        }
        return a
    }
}