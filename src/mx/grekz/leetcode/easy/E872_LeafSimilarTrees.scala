package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E872_LeafSimilarTrees {
    def dfs(n: TreeNode): String = if ( n == null ) "" else dfs(n.left) + dfs(n.right) + (if (n.right == n.left) n.value else "")
    def leafSimilar(root1: TreeNode, root2: TreeNode): Boolean = dfs(root1).equals(dfs(root2))
}