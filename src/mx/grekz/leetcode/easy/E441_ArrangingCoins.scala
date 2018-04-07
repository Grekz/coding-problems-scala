package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E441_ArrangingCoins {
    def arrangeCoins(n: Int): Int = {
        ( Math.sqrt( 1 + 8L * n ).toInt - 1 ) / 2
    }
}