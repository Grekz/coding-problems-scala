package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E075_SortColors {
    def sortColors(nums: Array[Int]): Unit = {
        def swap( a :Int, b :Int) :Unit = {
            var t = nums(a)
            nums(a) = nums(b)
            nums(b) = t
        }
        var ( i, j, k ) = ( 0, 0, nums.length - 1 )
        while ( i <= k ) {
            if ( nums(i) == 0 ){
                swap(i, j)
                j += 1   
            }else if ( nums(i) == 2 ) {
                swap(i, k)
                k -= 1
                i -= 1
            }
            i += 1
        }
    }
}