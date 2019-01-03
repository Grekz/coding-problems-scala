package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E922_SortArrayByParityII {
    def sortArrayByParityII(A: Array[Int]): Array[Int] = {
        var (i, j, res) = (0, 1, new Array[Int](A.size))
        for ( x: Int <- A ) {
            if ( (x & 1) == 0 ) {
                res(i) = x
                i += 2
            }else{
                res(j) = x
                j += 2
            }
        }
        return res
    }
}