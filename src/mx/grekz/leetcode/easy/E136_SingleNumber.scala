package mx.grekz.leetcode.easy

object E136_SingleNumber {
  
    def singleNumber(nums: Array[Int]): Int = {
        nums.reduce( _ ^ _ )
    }
}