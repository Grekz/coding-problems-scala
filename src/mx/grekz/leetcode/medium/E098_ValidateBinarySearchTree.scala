package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E098_ValidateBinarySearchTree {

    def isValidBST(root: TreeNode): Boolean = {
        return root == null || dfs(root, Long.MaxValue, Long.MinValue); 
    }
    def dfs(root :TreeNode, max :Long, min :Long) : Boolean = {
        return root == null || !(root.value >= max || root.value <= min) && dfs(root.left, root.value, min) && dfs(root.right, max, root.value)
    }
}