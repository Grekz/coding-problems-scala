package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode

object E110_BalancedBinaryTree {
  
    def isBalanced(root: TreeNode): Boolean = {
        def dfs( root: TreeNode): Int = {
            if ( root == null ) { return 0; }
            val lh = dfs(root.left);
            if ( lh == -1 ) { return lh; }
            val rh = dfs(root.right);
            if ( rh == -1 ) { return rh; }
            val dif = lh - rh;
            if ( dif > 1 || dif < -1 ) { return -1; }
            return Math.max(lh, rh) + 1 ;
        }
        return dfs(root) != -1
    }
}