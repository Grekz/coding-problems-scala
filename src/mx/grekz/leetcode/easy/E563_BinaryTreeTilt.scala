package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E563_BinaryTreeTilt {
    def findTilt(root: TreeNode): Int = {
        var su = 0
        def doit(n: TreeNode): Int = {
            if ( n == null ) return 0
            var left = doit(n.left)
            var right = doit(n.right)
            su += Math.abs(left-right)
            return n.value + left + right
        }
        doit(root)
        su
    }
}