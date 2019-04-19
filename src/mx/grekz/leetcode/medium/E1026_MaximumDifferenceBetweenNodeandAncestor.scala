package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E1026_MaximumDifferenceBetweenNodeandAncestor {
    def maxAncestorDiff(root: TreeNode): Int = {
        return dfs(root, root.value, root.value)
    }
    def dfs( node: TreeNode, max: Int, min: Int) : Int = {
        if ( node == null ) {
            return max - min
        }
        var ma = Math.max(max, node.value)
        var mi = Math.min(min, node.value)
        return Math.max(dfs(node.left, ma, mi), dfs(node.right, ma, mi))
    }
}