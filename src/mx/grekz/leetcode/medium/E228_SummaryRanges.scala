package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E228_SummaryRanges {
    def summaryRanges(nums: Array[Int]): List[String] = {
        val n = nums.size
        var i = 0
        var j = 0
        var res = scala.collection.mutable.MutableList[String]()
        while ( i < n ) {
            val c = nums(i).toString
            j = i
            while ( j + 1 < n && nums(j + 1) - nums(j) == 1 ) 
                j += 1
            res += c + (if ( i == j ) "" else "->" + nums(j).toString)
            i = j + 1
        }
        return res.toList
    }
}