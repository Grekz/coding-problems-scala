package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E701_InsertintoaBinarySearchTree {
    def insertIntoBST(root: TreeNode, `val`: Int): TreeNode = {
        if ( root == null ) return new TreeNode(`val`)
        if ( `val` < root.value ) 
            root.left = insertIntoBST(root.left, `val`)
        else
            root.right = insertIntoBST(root.right, `val`)
        return root
    }
}