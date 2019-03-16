package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E1006_ClumsyFactorial {
    def clumsy(N: Int): Int = {
        val magic = Array(1, 2, 2, -1, 0, 0, 3, 3)
        return N + magic(if( N > 4 ) N % 4 else N + 3)
    }
}