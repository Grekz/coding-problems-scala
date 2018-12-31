package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E965_UnivaluedBinaryTree {
    def isUnivalTree(root: TreeNode): Boolean = {
        if ( root == null )
            return true
        else {
            if ( root.left != null && root.left.value != root.value || !isUnivalTree(root.left) ) {
                return false
            } 
            if ( root.right != null && root.right.value != root.value || !isUnivalTree(root.right) ) {
                return false
            }
            return true
        }
    }
}