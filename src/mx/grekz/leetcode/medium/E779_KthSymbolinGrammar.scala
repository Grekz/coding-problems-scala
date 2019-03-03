package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E779_KthSymbolinGrammar {
    def kthGrammar(N: Int, K: Int): Int = {
        var n = 0 
        var k = K - 1
        while (k > 0){
            k &= k - 1
            n += 1
        }
        return n & 1
    }
}