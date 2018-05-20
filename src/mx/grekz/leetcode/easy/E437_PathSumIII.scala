package mx.grekz.leetcode.easy
import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E437_PathSumIII {
    def pathSum(root: TreeNode, sum: Int): Int = {
        if ( root == null )
            0
        else
            doit(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum)
    }
    def doit(n :TreeNode, s :Int) :Int = {
        if ( n == null )
            0
        else
            ( if (n.value == s) 1 else 0 ) + doit(n.left, s - n.value) + doit(n.right, s - n.value)
    }
}