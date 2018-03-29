package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E485_MaxConsecutiveOnes {
    def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
        var cur = 0
        var max = 0
        for( x <- nums ){
            if ( x == 1 ) 
                cur+=1
            else 
                cur = 0
            if ( max < cur ) 
                max = cur
        }
        max
    }
}