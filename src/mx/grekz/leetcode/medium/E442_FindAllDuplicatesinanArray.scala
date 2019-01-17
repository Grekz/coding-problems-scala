package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E442_FindAllDuplicatesinanArray {
    def findDuplicates(nums: Array[Int]): List[Int] = {
        var res = scala.collection.mutable.ArrayBuffer[Int]()
        for ( i <- 0 until nums.length ) {
            val cur = Math.abs(nums(i)) - 1
            if ( nums(cur) < 0 )
                res += cur + 1
            else
                nums(cur) = -nums(cur)
        }
        res.toList
    }
}