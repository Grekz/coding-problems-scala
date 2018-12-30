package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E905_SortArrayByParity {
    def sortArrayByParity(A: Array[Int]): Array[Int] = {
        var ( i, j ) = ( 0, A.length - 1)
        while ( i < j ) {
            var cur = A(i)
            if ( cur % 2 == 1 ) { 
                A(i) = A(j)
                A(j) = cur
                j -= 1
            } else {
                i += 1
            }
        }
        A
    }
}