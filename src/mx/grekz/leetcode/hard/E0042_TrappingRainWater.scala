package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
object E0042_TrappingRainWater {
    def trap(height: Array[Int]): Int = {
        var l = 0
        var r = height.size - 1
        var ml = 0
        var mr = 0
        var res = 0
        while ( l < r ) {
            if ( height(r) > height(l) ) {
                if ( ml < height(l) ) {
                    ml = height(l)
                }else{
                    res += ml - height(l)
                }
                l+=1
            }else{
                if ( mr < height(r) ) {
                    mr = height(r)
                }else{
                    res += mr - height(r)
                }
                r-=1
            }
        }
        return res
    }
}