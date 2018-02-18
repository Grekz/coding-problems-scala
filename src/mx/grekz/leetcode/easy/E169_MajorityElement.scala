package mx.grekz.leetcode.easy

object E169_MajorityElement {

    def majorityElement(nums: Array[Int]): Int = {
        if ( nums.length < 1 ) return -1
        if ( nums.length < 3 ) return nums(0)
        var res = 0
        var count = 0
        for ( x <- nums ) {
            if ( count == 0 )
                res = x
            if ( res == x )
                count +=1
            else
                count -=1
            
        }
        return res
    }
}