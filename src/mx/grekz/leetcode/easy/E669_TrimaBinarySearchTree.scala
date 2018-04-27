package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E669_TrimaBinarySearchTree {

    def trimBST(root: TreeNode, L: Int, R: Int): TreeNode = {
        if (root == null)
            return root
        if (root.value < L)
            return trimBST(root.right, L, R)
        if (root.value > R)
            return trimBST(root.left, L, R)
        root.left = trimBST(root.left, L, R)
        root.right = trimBST(root.right, L, R)
        root
    }
}