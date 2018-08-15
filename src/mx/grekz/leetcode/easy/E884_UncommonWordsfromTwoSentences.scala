package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E884_UncommonWordsfromTwoSentences {
    def uncommonFromSentences(A: String, B: String): Array[String] = {
        var tmp = ( A + " " + B ).split(" ")
        var values = scala.collection.mutable.Map[String, Int]()
        for ( e <- tmp ) {
            values(e) = values.getOrElse( e, 0 ) + 1
        }
        
        var res = List[String]()
        for ( (k, v) <- values ) {
            if ( v == 1 ) {
                res :+= k
            }
        }
        res.toArray 
    }
}