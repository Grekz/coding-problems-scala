package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E0309_BestTimetoBuyandSellStockwithCooldown {
    def maxProfit(prices: Array[Int]): Int = {
        var a = 0
        var b = 0 
        var c = Integer.MIN_VALUE
        for (price <- prices) {
            var d = b
            b = Math.max(b, c + price)
            c = Math.max(c, a - price)
            a = d
        }
        return b
    }
}