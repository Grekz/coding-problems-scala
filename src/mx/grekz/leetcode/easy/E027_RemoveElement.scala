package mx.grekz.leetcode.easy

object E027_RemoveElement {
    def removeElement(nums: Array[Int], x: Int): Int = {
        var count = 0;
        for( i <- 0 until nums.length ){
            if(nums(i) != x ){
                var temp = nums(i);
                nums(i) = nums(count);
                nums(count) = temp;
                count += 1;
            }
        } 
        return count;
    }
}