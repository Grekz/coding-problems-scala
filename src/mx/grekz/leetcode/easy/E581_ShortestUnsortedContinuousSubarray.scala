package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E581_ShortestUnsortedContinuousSubarray {

    def findUnsortedSubarray(nums: Array[Int]): Int = {
        var ( n, mi, ma, ini, end, b, a) = (nums.size - 1, 2147483647, -2147483648, -1, -2, 0, 0)
        for ( i <- 0 to n) {
            b = nums(n - i)
            a = nums(i)
            ma = Math.max(ma, a)
            mi = Math.min(mi, b)
            if ( a < ma )
                end = i
            if ( b > mi )
                ini = n - i
        }
        return end - ini + 1
    }
}