package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E383_RansomNote {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        val map = scala.collection.mutable.Map(magazine.groupBy(identity).mapValues(_.size).toSeq : _*)
        for( c <- ransomNote ) {
            if ( !map.contains(c) || map(c) == 0 ) {
                return false
            }
            map(c) = map(c) - 1
        }
        true
    }
}