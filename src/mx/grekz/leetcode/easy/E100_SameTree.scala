package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode

object E100_SameTree {
    def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
        if(p == null && q == null){ return true; }
        if(p == null || q == null){ return false; }
        if(p.value == q.value) { return isSameTree(p.right, q.right) && isSameTree(p.left, q.left); }
        return false;
    }
}