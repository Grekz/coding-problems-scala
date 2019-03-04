package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E890_FindandReplacePattern {
    def findAndReplacePattern(words: Array[String], pattern: String): List[String] = {
        var res = scala.collection.mutable.ListBuffer[String]()
        for ( x <- words ) {
            if ( check(x, pattern) )
                res += x
        }
        return res.toList
    }
    def check( a: String, b: String ): Boolean = {
        var m = scala.collection.mutable.HashMap.empty[Char,Char]
        var i = 0
        for ( x <- a ) {
            val bChar = b.charAt(i)
            i += 1
            m.getOrElseUpdate(x, bChar)
            if ( m(x) != bChar ) 
                return false
        }
        var ch = Array.fill[Boolean](26)(false)
        for ( x <- m.values ) {
            if ( ch(x - 97) )
                return false
            ch(x - 97) = true
        }
        return true
    }
}