package mx.grekz.leetcode.medium
import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E102_BinaryTreeLevelOrderTraversal {

    def levelOrder(root: TreeNode): List[List[Int]] = {
        var res = List[List[Int]]()
        def doit(walk: TreeNode, lvl: Int) :Unit = {
            if ( res.length <= lvl )
                res :+= List[Int]()
            res = res.updated(lvl, res(lvl) :+ walk.value )
            if ( walk.left != null )
                doit( walk.left, lvl+1)
            if ( walk.right != null )
                doit( walk.right, lvl+1)
        }
        if ( root != null )
            doit( root, 0)
        res
    }
}