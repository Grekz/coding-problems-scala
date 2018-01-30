package mx.grekz.leetcode.easy

object E070_ClimbingStairs {
    def climbStairs(n: Int): Int = {
        var a = Math.sqrt(5)
        var b = Math.pow( (1.0 + a) / 2.0 , n + 1)
        var c = Math.pow( (1.0 - a) / 2.0 , n + 1)
        var res = 1.0/a * ( b - c )
        return res.toInt
    }
}