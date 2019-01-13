package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E938_RangeSumofBST {
    def rangeSumBST(root: TreeNode, L: Int, R: Int): Int = {
        if ( root == null ) return 0
        var res = 0
        if ( L <= root.value && root.value <= R )
            res += root.value
        if ( L <= root.value )
            res += rangeSumBST(root.left, L, R)
        if ( R >= root.value )
            res += rangeSumBST(root.right, L, R)
        return res
    }
}