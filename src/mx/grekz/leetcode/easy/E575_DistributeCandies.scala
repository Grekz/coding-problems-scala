package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E575_DistributeCandies {
    def distributeCandies(candies: Array[Int]): Int = {
        Math.min(candies.length / 2 , candies.distinct.size)
    }
}