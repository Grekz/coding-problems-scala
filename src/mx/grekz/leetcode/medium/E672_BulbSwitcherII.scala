package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E672_BulbSwitcherII {
    def flipLights(n: Int, m: Int): Int = {
        if(m == 0) return 1
        if(n == 1) return 2
        if(n == 2 && m == 1) return 3
        if(n == 2 || m == 1) return 4
        if(m == 2) return 7
        return 8
    }
}