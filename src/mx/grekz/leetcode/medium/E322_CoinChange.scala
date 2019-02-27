package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E322_CoinChange {
    def coinChange(coins: Array[Int], amount: Int): Int = {
        val m = amount + 1
        var dp = Array.fill(m)(m)
        dp(0) = 0
        for ( i <- 1 to amount; c <- coins )
            if ( c <= i )
                dp(i) = Math.min(dp(i), dp(i - c) + 1)
        return if ( dp(amount) <= amount )
            dp(amount)
        else
            -1
    }
}