package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
object E052_NQueensII {

    def totalNQueens(n: Int): Int = {
        val cols = new Array[Boolean](n)
        val d1 = new Array[Boolean](n*2)
        val d2 = new Array[Boolean](2*n)
        return bt(0, cols, d1, d2, n, 0)
    }
    def bt(row: Int, cols: Array[Boolean], d1: Array[Boolean], d2: Array[Boolean], n: Int, count:Int): Int = {
        if ( row == n ) {
            count + 1
        }else{
            var res = count
            for ( c <- 0 until n ) {
                val id1 = n + c - row
                val id2 = c + row
                if ( !( cols(c) || d1(id1) || d2(id2) ) ) {
                    cols(c) = true
                    d1(id1) = true
                    d2(id2) = true
                    res = bt( row + 1, cols, d1, d2, n, res)
                    cols(c) = false
                    d1(id1) = false
                    d2(id2) = false
                }
            }
            res
        }
    }
}