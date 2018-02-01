package mx.grekz.leetcode.easy

object E088_MergeSortedArray {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        if( n == 0 ) return
        var i = m -1
        var j = n - 1
        var ind = n + m  - 1
        while( ind >= 0 ){
            if(i < 0) {
                nums1(ind) = nums2(j)
                j-=1
            } else if(j < 0) {
                nums1(ind) = nums1(i)
                i-=1
            } else if(nums1(i) > nums2(j)) {
                nums1(ind) = nums1(i)
                i-=1
            } else {
                nums1(ind) = nums2(j)
                j-=1
            } 
            ind-=1
        }
    }  
}