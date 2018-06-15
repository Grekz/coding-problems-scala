package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
object E123_BestTimetoBuyandSellStockIII {

    def maxProfit(prices: Array[Int]): Int = {
        var ( profitA, profitB, buyA, buyB ) = ( 0, 0, -2147483648, -2147483648 )
        for ( (e, i) <- prices.zipWithIndex ) {
            if ( i > 2 )
                profitB = Math.max(profitB, buyB + e)
            if ( i > 1 )
                buyB = Math.max(buyB, profitA - e)
            profitA = Math.max(profitA, buyA + e)
            buyA = Math.max(buyA, -e)
        }
        return Math.max(profitA, profitB)
    }
}