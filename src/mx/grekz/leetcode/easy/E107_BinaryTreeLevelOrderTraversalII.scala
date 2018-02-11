package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode
import scala.collection.mutable.Buffer


object E107_BinaryTreeLevelOrderTraversalII {
  
    def levelOrderBottom(root: TreeNode): List[List[Int]] = {
        var res = List[Buffer[Int]]()
        def dfs(lvl: Int, root:TreeNode):Unit = {
            if ( root != null ) {
                var le = res.length;
                var _lvl = lvl + 1;
                if ( le < _lvl ) {
                    res = Buffer[Int]() :: res;
                    le+=1;
                }
                res(le - _lvl) += root.value;
                dfs( _lvl, root.left);
                dfs( _lvl, root.right);
            }
        }
        dfs( 0, root)
        return res.map(_.toList)
    }
}