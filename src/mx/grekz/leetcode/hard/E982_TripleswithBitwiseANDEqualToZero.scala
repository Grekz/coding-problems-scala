package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
object E982_TripleswithBitwiseANDEqualToZero {

    def countTriplets(A: Array[Int]): Int = {
        var res = 0
        var tmp = scala.collection.mutable.HashMap[Int, Int]().withDefaultValue(0)
        for ( a <- A; b <- A ) tmp(a&b) += 1
        for ( (k,v) <- tmp; a <- A )
            if ( (k&a) == 0 )
                res += v
        res
    }
}