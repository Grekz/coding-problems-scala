package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E697_DegreeofanArray {

    def findShortestSubArray(nums: Array[Int]): Int = {
        var counts = scala.collection.mutable.Map[Int, Int]()
        var ini = scala.collection.mutable.Map[Int, Int]()
        var max = 0
        var res = 0
        for ( (x, i) <- nums.zipWithIndex ) {
            var curIni = ini.getOrElseUpdate(x, i)
            var cur = counts.getOrElseUpdate(x, 0) + 1
            counts(x) = cur
            if (max < cur) {
                max = cur
                res = i - curIni + 1
            }else if ( max == cur) {
                res = Math.min(res, i - curIni + 1)
            }
        }
        res
    }
}