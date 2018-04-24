package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E804_UniqueMorseCodeWords {
    def uniqueMorseRepresentations(words: Array[String]): Int = {
        val cc = Array(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
        var s = scala.collection.mutable.Set[String]()
        for ( w <- words ) {
            var x :String= ""
            for ( c <- w ) {
                x += cc(c.toInt - 97)
            }
            s.add(x)
        }
        s.size
    }
}