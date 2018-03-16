package mx.grekz.leetcode.easy

object E231_PowerofTwo {

    def isPowerOfTwo(_n: Int): Boolean = {
        if(_n < 1 ){return false}
        var n = _n
        var hasOne = false
        for(i <- 0 to 31){
            if( (n & 1) == 1 ){
                if(hasOne) return false
                else hasOne = true
            }
            n = n >> 1
        }
        true
    }
}