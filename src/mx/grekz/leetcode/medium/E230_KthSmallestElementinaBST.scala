package mx.grekz.leetcode.medium
import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E230_KthSmallestElementinaBST {

    def countit(n :TreeNode) :Int = if ( n == null ) 0 else 1 + countit(n.left) + countit(n.right)
    def kthSmallest(root: TreeNode, k: Int): Int = {
        var count = countit(root.left) + 1
        if ( count == k )
            root.value
        else if ( count > k ) 
            kthSmallest(root.left, k)
        else
            kthSmallest(root.right, k - count)
    }
}