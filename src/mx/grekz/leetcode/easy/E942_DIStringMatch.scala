package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E942_DIStringMatch {
    def diStringMatch(S: String): Array[Int] = {
        var n = S.size
        var ( left, right ) = (0, n)
        var res = scala.collection.mutable.ArrayBuffer[Int]()
        for ( x <- S ) {
            var cur = left 
            if( x == 'I' ) {
                left += 1
            } else {
                cur = right
                right -= 1
            }
            res += cur
        }
        res += right
        return res.toArray
    }
}