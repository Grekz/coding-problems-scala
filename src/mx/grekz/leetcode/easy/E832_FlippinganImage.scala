package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E832_FlippinganImage {
    def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = A.map( _.reverse.map(_^1))
}