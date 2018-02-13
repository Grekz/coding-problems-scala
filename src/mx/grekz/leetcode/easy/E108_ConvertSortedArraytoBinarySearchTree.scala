package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode

object E108_ConvertSortedArraytoBinarySearchTree {
  
    def sortedArrayToBST(nums: Array[Int]): TreeNode = {
        if ( nums.length == 0 ) { return null; }
        def helper(l:Int, h:Int) : TreeNode = {
            if ( l > h ) { return null; }
            var m = l + ( h - l ) / 2;
            var res = new TreeNode(nums(m));
            res.left = helper( l, m-1);
            res.right = helper( m+1, h);
            return res;            
        }
        return helper( 0, nums.length-1);
    }
}