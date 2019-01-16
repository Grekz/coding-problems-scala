package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E338_CountingBits {
    def countBits(num: Int): Array[Int] = {
        var res = Array.fill(num + 1)(0)
        for ( i <- 1 to num )
           res(i) = res( i >> 1 ) + i % 2 
        res
    }
}