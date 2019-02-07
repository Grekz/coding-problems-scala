package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E089_GrayCode {
    def grayCode(n: Int): List[Int] = {
        val res = Array.fill(1<<n)(0)
        for ( i <- 0 until res.size )
            res(i) = i ^ i >> 1
        res.toList
    }
}