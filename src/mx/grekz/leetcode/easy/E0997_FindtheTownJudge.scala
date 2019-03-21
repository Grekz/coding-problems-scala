package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E0997_FindtheTownJudge {
    def findJudge(N: Int, trust: Array[Array[Int]]): Int = {
        var c = Array.fill(N + 1)(0)
        for ( x <- trust ) {
            c(x(0)) -= 1
            c(x(1)) += 1
        }
        for ( i <- 1 to N ) {
            if ( c(i) == N - 1 ) {
                return i
            }
        }
        return -1
    }
}