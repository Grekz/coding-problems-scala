package mx.grekz.leetcode.easy

object E053_MaximumSubarray {
    def maxSubArray(nums: Array[Int]): Int = {
        var (res, cur) = (nums(0), nums(0))
        for (i <- Range(1,nums.length)){
            cur = Math.max(cur+nums(i), nums(i))
            res = Math.max(cur,res)
        }
        return res
    }  
}