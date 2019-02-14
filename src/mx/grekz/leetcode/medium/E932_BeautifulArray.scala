package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E932_BeautifulArray {
    def beautifulArray(N: Int): Array[Int] = {
        var res = scala.collection.mutable.ListBuffer[Int]()
        res += 1
        while ( res.size < N ) {
            var tmp = scala.collection.mutable.ListBuffer[Int]()
            for ( i <- res )
                if ( i * 2 - 1 <= N )
                    tmp += i * 2 - 1
            for ( i <- res )
                if ( i * 2 <= N )
                    tmp += i * 2
            res = tmp
        }
        return res.toArray
    }
}