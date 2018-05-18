package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E543_DiameterofBinaryTree {
    def diameterOfBinaryTree(root: TreeNode): Int = {
        var res :Int = 0
        def doit(n :TreeNode) : Int = {
            if ( n == null )
                0
            else{
                var ( le, ri ) = (doit(n.left), doit(n.right))
                res = Math.max(res, le+ri)
                Math.max(le,ri) + 1 
            }
        }
        doit(root)
        res
    }
}