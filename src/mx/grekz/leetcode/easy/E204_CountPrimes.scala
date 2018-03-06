package mx.grekz.leetcode.easy

object E204_CountPrimes {

    def countPrimes(n: Int): Int = {
        if ( n < 3 ) return 0
        if ( n == 3 ) return 1
        var tmp = Array.fill[Boolean](n+1)(false)
        for ( i <- 2 to n  if i * i <= n ) {
            if ( !tmp(i)){
                for ( j <- i * 2 until n by i ){
                    tmp(j) = true
                }
            }
        }
        var res = -2
        for ( i <- tmp.dropRight(1) )
            if ( !i )
                res += 1
        res
    }
}