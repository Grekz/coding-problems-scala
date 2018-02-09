package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode

object E112_PathSum {
    def hasPathSum(root: TreeNode, sum: Int): Boolean = {
        if ( root == null ) {return false}
        var sumOk = ( sum - root.value == 0 && root.left == null && root.right == null)
        var remain = sum - root.value
        return sumOk || hasPathSum(root.left, remain) || hasPathSum(root.right, remain)
    }
}