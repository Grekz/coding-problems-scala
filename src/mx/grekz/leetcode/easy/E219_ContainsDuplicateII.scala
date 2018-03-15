package mx.grekz.leetcode.easy

object E219_ContainsDuplicateII {

    def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
        if (k == 0 || nums == null || nums.length < 2 ) { return false }
        var values = scala.collection.mutable.Map[Int, Int]()
        for( i <- 0 until nums.length ) {
            if(values.contains(nums(i)) && ( i - values(nums(i)) <= k ) ){
                return true
            }
            values(nums(i)) = i
        }
        false
    }
}