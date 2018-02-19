package mx.grekz.leetcode.easy
import scala.collection.mutable.ListBuffer

object E118_PascalsTriangle {  
    def generate(numRows: Int): List[List[Int]] = {
        var res = new ListBuffer[List[Int]]()
        var cur = new ListBuffer[Int]()
        for ( i <- 0 until numRows ) {
            cur.prepend(1)
            for ( j <- 1 until cur.length - 1 ) {
                cur(j) = cur(j) + cur(j+1)
            }
            res += cur.toList
        }
        res.toList
    }
}