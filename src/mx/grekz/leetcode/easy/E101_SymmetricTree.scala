package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode

object E101_SymmetricTree {
  
    def isSymmetric(root: TreeNode): Boolean = {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
    
    def isMirror(l: TreeNode, r: TreeNode): Boolean = {
        if ( l == null && r == null ) return true;
        if ( l == null || r == null ) return false;
        return l.value == r.value && isMirror(l.left, r.right) && isMirror(l.right, r.left);
    }
}