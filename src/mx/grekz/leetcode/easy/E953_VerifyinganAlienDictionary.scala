package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E953_VerifyinganAlienDictionary {
    def isAlienSorted(words: Array[String], order: String): Boolean = {
        if ( words.length > 1 ) {
            var dict = createDict(order)
            var prev = words(0)
            for ( w <- words ) {
                if ( compare(prev, w, dict) > 0 ) {
                    return false
                }
                prev = w
            }
            true
        } else{
            true
        }    
    }
    def createDict(s: String): scala.collection.mutable.Map[Char, Int] = {
        var res = scala.collection.mutable.Map[Char, Int]()
        for ( (c,i) <- s.zipWithIndex) res.put(c,i)
        res
    }
    def compare(a: String, b: String, dict:scala.collection.mutable.Map[Char, Int]): Int = {
        var (al, bl, com, i) = (a.length(), b.length(), 0, 0)
        while ( i < al && i < bl && com == 0 ) {
            com = dict(a(i)) - dict(b(i)) 
            i+=1
        }
        if ( com == 0 ) al - bl else com
    }
}