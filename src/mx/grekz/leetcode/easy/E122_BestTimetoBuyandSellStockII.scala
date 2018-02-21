package mx.grekz.leetcode.easy

object E122_BestTimetoBuyandSellStockII {
  
    def maxProfit(prices: Array[Int]): Int = {
        var res = 0
        for ( i <- 0 until prices.length - 1 )
            if (prices(i) < prices( i + 1))
                res += prices(i+1) - prices(i)
        res
    }
}