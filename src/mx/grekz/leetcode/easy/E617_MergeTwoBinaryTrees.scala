package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E617_MergeTwoBinaryTrees {
    def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode = {
        if ( t1 == null ) t2
        else if ( t2 == null ) t1
        else {
            var c = TreeNode( t1.value + t2.value )
            c.left = mergeTrees(t1.left, t2.left)
            c.right = mergeTrees(t1.right, t2.right)
            c
        }
    }
}