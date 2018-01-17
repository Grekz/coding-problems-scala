package mx.grekz.leetcode.easy

object E026_RemoveDuplicatesfromSortedArray {
    def removeDuplicates(nums: Array[Int]): Int = {
        if (nums == null || nums.length < 1 ) { return 0; }
        if ( nums.length == 1 ) { return 1; }
        var ( len, base, count, cur ) = ( nums.length, nums(0), 0, 1);
        for( i <- 1.to(len-1) ){
            if ( base == nums(i) ) {
                count+=1;
                nums(i) = -1;
            }else{
                base = nums(i);
                nums(cur) = nums(i);
                cur+=1;
            }
        }
        return len - count;
    }
}