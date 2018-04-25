package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E814_BinaryTreePruning {

    def pruneTree(root: TreeNode): TreeNode = {
        if ( root == null )
            return root
        root.left = pruneTree(root.left)
        root.right = pruneTree(root.right)
        if ( root.left == null && root.right == null && root.value == 0 )
            return null
        return root
    }
}