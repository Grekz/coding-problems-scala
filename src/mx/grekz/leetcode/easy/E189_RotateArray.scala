package mx.grekz.leetcode.easy

object E189_RotateArray {
    def rotate(nums: Array[Int], k: Int): Unit = {
        val n = nums.length
        var _k = k % n
        if ( n == 0 || _k == 0 ) return
        def reverse ( a: Int, b: Int): Unit = {
            var (i, j) = (a,b)
            while( i < j){
                val tmp = nums(i)
                nums(i) = nums(j)
                nums(j) = tmp
                i+=1
                j-=1
            }
        }
        reverse( 0, n-1)
        reverse( 0, _k-1)
        reverse( _k, n-1)
    }
}