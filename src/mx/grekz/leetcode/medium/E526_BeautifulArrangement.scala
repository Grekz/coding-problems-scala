package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E526_BeautifulArrangement {

    def countArrangement(N: Int): Int = {
        var count = 0
        var v = Array.fill(N+1)(false)
        def permutate(pos: Int): Unit = {
            if ( pos > N ) 
                count += 1 
            else
                for ( i <- 1 to N ) 
                    if ( !v(i) && ( i % pos == 0 || pos % i == 0 ) ) {
                        v(i) = true
                        permutate(pos+1)
                        v(i) = false
                    }
        }
        permutate(1)
        return count
    }
}