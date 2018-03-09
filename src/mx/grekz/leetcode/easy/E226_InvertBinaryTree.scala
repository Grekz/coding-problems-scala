package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode

object E226_InvertBinaryTree {
    def invertTree(root: TreeNode): TreeNode = {
        if(root == null) return null
        var temp = invertTree(root.left)
        root.left = invertTree(root.right)
        root.right = temp
        root
    }
}