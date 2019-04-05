package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E0941_ValidMountainArray {
    def validMountainArray(A: Array[Int]): Boolean = {
        var n = A.length
        var i = 0
        while ( i + 1 < n && A(i) < A(i + 1) ) i+=1 
        if ( i== 0 || i == n - 1 ) return false
        while ( i + 1 < n && A(i) > A(i + 1) ) i+=1
        return i == n - 1
    }
}