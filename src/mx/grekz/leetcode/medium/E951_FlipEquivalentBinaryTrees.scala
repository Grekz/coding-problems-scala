package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E951_FlipEquivalentBinaryTrees {
    def flipEquiv(a: TreeNode, b: TreeNode): Boolean = {
        if ( a == null || b == null ) a == b else a.value == b.value && (flipEquiv(a.left, b.left) && flipEquiv(a.right, b.right) || flipEquiv(a.right, b.left) && flipEquiv(a.left, b.right))
    }
}