package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E414_ThirdMaximumNumber {

    def thirdMax(nums: Array[Int]): Int = {
        if (nums.length < 3 ) 
            return nums.reduce(_ max _)
        var m1 = nums.reduce(_ min _)
        var (m2, m3) = (m1, m1)
        for ( n <- nums ) {
            if ( m1 < n ) {
                m3 = m2
                m2 = m1
                m1 = n
            }else if ( m2 < n && m1 > n ){
                m3 = m2
                m2 = n
            }else if ( m3 < n && m2 > n ){
                m3 = n
            }
        }
        if ( m1 > m2 && m2 > m3 )
            return m3
        return m1
    }
}