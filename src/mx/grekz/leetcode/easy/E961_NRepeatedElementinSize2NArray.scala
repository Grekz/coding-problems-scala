package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E961_NRepeatedElementinSize2NArray {
    def repeatedNTimes(A: Array[Int]): Int = {
        var c = scala.collection.mutable.Map[Int, Boolean]()
        for ( x <- A ) {
            if ( c.contains(x) )
                return x
            c(x) = true
        }
        -1
    }
}