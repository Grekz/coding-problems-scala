package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E739_DailyTemperatures {
    def dailyTemperatures(T: Array[Int]): Array[Int] = {
        var n = T.size
        var top = -1
        var res = Array.fill(n)(0)
        var stack = Array.fill(n)(0)
        var idx = 0
        for ( i <- 0.until(n) ) {
            while ( top >= 0 && T(i) > T(stack(top)) ) {
                idx = stack(top)
                top -= 1
                res(idx) = i - idx
            }
            top += 1
            stack(top) = i
        }
        return res
    }
}