package mx.grekz.leetcode.medium
import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E094_BinaryTreeInorderTraversal {
    def inorderTraversal(root: TreeNode): List[Int] = {
        var res = scala.collection.mutable.ListBuffer[Int]()
        def doit( n :TreeNode): Unit = {
            if ( n != null ) {
                doit(n.left)
                res += n.value
                doit(n.right)
            }
        }
        doit(root)
        res.toList
    }
}