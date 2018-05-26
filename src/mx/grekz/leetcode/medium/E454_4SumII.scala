package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E454_4SumII {
    def fourSumCount(A: Array[Int], B: Array[Int], C: Array[Int], D: Array[Int]): Int = {
        var m = scala.collection.mutable.Map[Int, Int]().withDefaultValue(0)
        var res = 0
        for ( a <- A; b <- B ) m(a+b) += 1
        for ( a <- D; b <- C ) res += m(-(a+b)) 
        res
    }
}