package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E789_EscapeTheGhosts {
    def escapeGhosts(ghosts: Array[Array[Int]], target: Array[Int]): Boolean = {
        val t0 = target(0)
        var t1 = target(1)
        var dest = Math.abs(t0) + Math.abs(t1)
        for ( g <- ghosts ) {
            val cur = Math.abs(g(0)-t0) + Math.abs(g(1)-t1)
            if ( cur <= dest )
                return false
        }
        return true
    }
}