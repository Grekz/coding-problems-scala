package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E791_CustomSortString {

    def customSortString(S: String, T: String): String = {
        var tp = Array.fill(26)(0)
        var res = ""
        for ( x <- T ) tp(x.toInt - 97) += 1
        for ( x <- S ) {
            var n = tp(x.toInt - 97)
            for ( _ <- 0 until n ) {
                res += x   
            }
            tp(x.toInt - 97) = 0
        } 
        for ( x <- T ) {
            var n = tp(x.toInt - 97)
            for ( _ <- 0 until n )
                res += x
            tp(x.toInt - 97) = 0
        }
        res
    }
}