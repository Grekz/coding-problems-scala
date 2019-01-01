package mx.grekz.leetcode.easy

import util.control.Breaks._

/**
 * @author grekz
 */
object E944_DeleteColumnstoMakeSorted {
    def minDeletionSize(A: Array[String]): Int = {
        var ( lenA, lenW, res) = (A.size - 1, A(0).length(), 0)
        for ( i <- 0 until lenW ) {
            breakable {
                for ( j <- 0 until lenA )
                    if ( A(j).charAt(i) > A(j+1).charAt(i) ) {
                        res += 1
                        break
                    }  
            }
        }
        res
    }
}