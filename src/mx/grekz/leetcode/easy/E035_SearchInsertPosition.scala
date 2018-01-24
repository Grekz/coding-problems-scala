package mx.grekz.leetcode.easy

object E035_SearchInsertPosition {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        var ( a, b ) = (0, nums.length - 1)
        while( a <= b) {
            val m = ( a + b ) / 2;
            if ( nums(m) == target ) return m;
            if ( nums(m) > target )
                b = m - 1;
            else
                a = m + 1;
        }
        return a;
    }
}