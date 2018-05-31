package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E049_GroupAnagrams {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        var m = scala.collection.mutable.Map[String, List[String]]().withDefaultValue(List())
        for ( s <- strs ) {
            var key = s.toList.sorted.toString
            m(key) = m(key) ++ List(s)   
        }
        m.values.toList
        //        strs.groupBy(_.sorted).values.map(_.toList).toList
    }
}