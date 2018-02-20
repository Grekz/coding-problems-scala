package mx.grekz.leetcode.easy
import scala.collection.mutable.ListBuffer

object E119_PascalsTriangleII {
    def getRow(rowIndex: Int): List[Int] = {
        var cur = ListBuffer[Int](1)
        for ( i <- 0 until rowIndex ) {
            cur.prepend(1)
            for ( j <- 1 until cur.length - 1 ) {
                cur(j) = cur(j) + cur(j+1)
            }
        }
        cur.toList
    }  
}