package mx.grekz.leetcode.hard

object E004_MedianofTwoSortedArrays {
    def findMedianSortedArrays( n1: Array[ Int ], n2: Array[ Int ] ): Double = {
        val ( a, b ) = ( n1.size, n2.size )
        if ( a > b ) {
            return findMedianSortedArrays( n2, n1 )
        }
        var ( c, l, h ) = ( a + b + 1, 0, a )
        while ( l <= h ) {
            val m1 = ( l + h ) / 2
            val m2 = c / 2 - m1

            val la = if ( m1 == 0 ) Int.MinValue else n1( m1 - 1 )
            val lb = if ( m2 == 0 ) Int.MinValue else n2( m2 - 1 )

            val ra = if ( m1 == a ) Int.MaxValue else n1( m1 )
            val rb = if ( m2 == b ) Int.MaxValue else n2( m2 )

            if ( la > rb ) {
                h = m1 - 1
            } else if ( lb > ra ) {
                l = m1 + 1
            } else {
                if ( ( c - 1 ) % 2 == 0 ) {
                    return ( Math.max( la, lb ) + Math.min( ra, rb ) ) / 2.0
                }
                return Math.max( la, lb )
            }
        }
        return 0.0
    }
}