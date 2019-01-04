package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E700_SearchinaBinarySearchTree {
    def searchBST(root: TreeNode, `val`: Int): TreeNode = {
        if ( root == null ) return null
        if ( root.value == `val` ) return root
        return searchBST(if (`val` < root.value) root.left else root.right, `val`);
    }
}