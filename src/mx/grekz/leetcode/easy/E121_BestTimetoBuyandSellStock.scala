package mx.grekz.leetcode.easy

object E121_BestTimetoBuyandSellStock {
  
    def maxProfit(prices: Array[Int]): Int = {
        if(prices == null || prices.length <= 1)
            return 0;
        var buy = 2147483647; 
        var result = 0;
        for( stockPrice <- prices){
            if(stockPrice < buy){
                buy = stockPrice;
            }else if(result < (stockPrice - buy )){
                result = stockPrice - buy;
            }
        }
        return result;
    }
}