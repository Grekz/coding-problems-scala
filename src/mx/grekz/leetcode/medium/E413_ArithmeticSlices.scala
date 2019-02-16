package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E413_ArithmeticSlices {
    def numberOfArithmeticSlices(A: Array[Int]): Int = {
        var res = 0
        var tmp = 0
        var n = A.size - 1
        for ( i <- 2 to n ) {
            if ( A(i) - A(i-1) == A(i-1) - A(i-2) ) {
                tmp += 1
                res += tmp
            }else{
                tmp = 0
            }
        }
        return res
    }
}