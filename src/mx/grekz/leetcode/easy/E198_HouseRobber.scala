package mx.grekz.leetcode.easy

object E198_HouseRobber {
  
    def rob(nums: Array[Int]): Int = {
        var (a, b) = (0,0)
        for ( (x,i) <- nums.view.zipWithIndex ) {
            if ( i % 2 == 0 )
                a = Math.max(a + x, b)
            else
                b = Math.max(a, b + x)
        }
        Math.max(a,b)
    }
}