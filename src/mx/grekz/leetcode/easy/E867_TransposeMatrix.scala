package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E867_TransposeMatrix {
    def transpose(A: Array[Array[Int]]): Array[Array[Int]] = {
        var res = Array.fill(A(0).size, A.size)(0)
        for ( (a, i) <- A.zipWithIndex; (b, j) <- a.zipWithIndex ) res(j)(i) = b
        return res
    }
}