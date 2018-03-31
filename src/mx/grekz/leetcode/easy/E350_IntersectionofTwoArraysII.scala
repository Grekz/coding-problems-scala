package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E350_IntersectionofTwoArraysII {
    def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
        val map1 = nums1.groupBy(_.toInt).map(p => (p._1, p._2.length))
        val map2 = nums2.groupBy(_.toInt).map(p => (p._1, p._2.length))
        var res = List[Int]()
        for ((k,v) <- map1) {
            if ( map2.contains(k) ) {
                for ( i <- 1 to Math.min(v,map2(k))){
                    res ::= k
                }
            }
        }
        res.toArray
    }
}