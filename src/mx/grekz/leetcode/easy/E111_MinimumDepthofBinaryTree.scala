package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode

object E111_MinimumDepthofBinaryTree {
    def minDepth(root: TreeNode): Int = {
        if(root == null) return 0;
        return drill(root, 1);
    }
    
    def drill(walk:TreeNode,  lvl:Int) : Int = {
        if(walk == null) return Integer.MAX_VALUE;
        if(walk.left == null && walk.right == null) return lvl;
        return Math.min(drill(walk.left, lvl+1), drill(walk.right, lvl+1));
    }
}