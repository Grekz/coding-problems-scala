package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E404_SumofLeftLeaves {
    def sumOfLeftLeaves(root: TreeNode): Int = {
        if (root == null || ( root.left == null && root.right == null ) ) return 0;
        
        var ans = 0;
        if(root.left != null && root.left.left == null && root.left.right == null) 
            ans += root.left.value;
        ans + sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);   
    }
}