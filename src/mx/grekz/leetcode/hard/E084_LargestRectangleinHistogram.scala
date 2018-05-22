package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
object E084_LargestRectangleinHistogram {
    def largestRectangleArea(heights: Array[Int]): Int = {
        var res = 0
        var stack = scala.collection.mutable.Stack[Int]()
        for ( (e,i) <- (heights:+0).zipWithIndex ) {
            while ( !stack.isEmpty && e < heights(stack.top) ){
                val h = heights(stack.pop)
                val w = if (stack.isEmpty) i else i - stack.top - 1
                res = Math.max(res, h * w)
            }
            stack.push(i)
        }
        res
    }
}