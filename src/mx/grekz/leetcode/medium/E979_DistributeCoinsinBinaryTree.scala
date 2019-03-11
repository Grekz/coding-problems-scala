package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E979_DistributeCoinsinBinaryTree {
    def distributeCoins(root: TreeNode): Int = {
        var ans = 0
        def dfs(n: TreeNode): Int = {
            if ( n == null )
                0
            else{
                var l = dfs(n.left)
                var r = dfs(n.right)
                ans += Math.abs(l) + Math.abs(r)
                r + l + n.value - 1 
            }
        }
        dfs(root)
        ans
    }
}