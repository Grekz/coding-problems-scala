package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E257_BinaryTreePaths {

    def binaryTreePaths(root: TreeNode): List[String] = {
        var res: List[String] = List()
        def traverse(x : TreeNode, cur: String): Unit = {
            var tmp = cur + x.value
            if ( x.left == null && x.right == null )
                res ::= (tmp)
            else{
                if ( x.right != null )
                    traverse(x.right, tmp + "->")
                if ( x.left != null )
                    traverse(x.left, tmp + "->")
            }
        }
        if ( root != null )
            traverse(root, "")
        res
    }
}