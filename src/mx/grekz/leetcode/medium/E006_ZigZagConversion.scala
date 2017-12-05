package mx.grekz.leetcode.medium

/**
 * https://leetcode.com/problems/zigzag-conversion
 */
object E006_ZigZagConversion {  
    def convert(s: String, numRows: Int): String = {
        if ( numRows < 2 || s.length <= numRows )
            return s
        var res = Array.fill[String](numRows)("")
        var ( i, d ) = (0,0)
        for ( x <- s ) {
            res(i) += x
            if ( i == 0 )
                d = 1
            else if ( i == numRows - 1 )
                d = -1
            i += d
        }
        return res.mkString("")
    }
}