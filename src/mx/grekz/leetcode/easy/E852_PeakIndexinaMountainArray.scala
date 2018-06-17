package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E852_PeakIndexinaMountainArray {

    def peakIndexInMountainArray(A: Array[Int]): Int = {
        var ( res, m, i ) = ( 0, -2147483648, 0 )
        for ( x <- A ) {
            if ( x > m ) {
                m = x
                res = i
            }
            i+=1
        }
        res
    }
}