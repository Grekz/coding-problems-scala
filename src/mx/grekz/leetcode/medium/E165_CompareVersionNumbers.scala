package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E165_CompareVersionNumbers {
    def compareVersion(version1: String, version2: String): Int = {
        val ( a, b ) = ( version1.split("\\."), version2.split("\\.") )
        val ( al, bl ) = ( a.size, b.size )
        val n = Math.max(al, bl)
        for ( i <- 0 until n ) {
            val c = ( if ( i < al ) a(i).toInt else 0 ) - ( if ( i < bl ) b(i).toInt else 0 )   
            if ( c < 0 )
                return -1
            else if ( c > 0 )
                return 1
        }
        0
    }
}