package mx.grekz.leetcode.easy
import mx.grekz.leetcode.helper.TreeNode

/**
 * @author grekz
 */
object E530_MinimumAbsoluteDifferenceinBST {

    def getMinimumDifference(root: TreeNode): Int = {
        var minDiff :Int = 2147483647
        var prev :TreeNode = null
        def doit(n :TreeNode):Unit = {
            if (n != null) {
                doit(n.left)
                if (prev != null) minDiff = Math.min(minDiff, n.value - prev.value)
                prev = n
                doit(n.right)
            }
        }
        doit(root)
        return minDiff
    }
}