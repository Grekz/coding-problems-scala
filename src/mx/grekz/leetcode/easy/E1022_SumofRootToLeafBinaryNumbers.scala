package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E1022_SumofRootToLeafBinaryNumbers {
    def sumRootToLeaf(root: TreeNode): Int = {
        return dfs(root, 0)
    }
    def dfs(n:TreeNode, x: Int): Int = {
        return if ( n == null ) 0
        else {
            val c = x * 2 + n.value
            if ( n.left == null && n.right == null )
                c
            else
                dfs(n.left, c) + dfs(n.right, c)
        }
    }
}