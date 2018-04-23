package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E796_RotateString {

    def rotateString(A: String, B: String): Boolean = {
        A.size == B.size && (A+A).contains(B)
    }
}