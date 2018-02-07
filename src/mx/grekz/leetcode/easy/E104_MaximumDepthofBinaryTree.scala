package mx.grekz.leetcode.easy
import mx.grekz.leetcode.helper.TreeNode
object E104_MaximumDepthofBinaryTree {
  
    def maxDepth(root: TreeNode): Int = {
        if(root == null) return 0;
        val left = maxDepth(root.left);
        val right = maxDepth(root.right);
        return ( if ( left > right ) left else right ) +1;        
    }
}