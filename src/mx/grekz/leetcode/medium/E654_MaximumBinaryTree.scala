package mx.grekz.leetcode.medium
import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E654_MaximumBinaryTree {
    def constructMaximumBinaryTree(nums: Array[Int]): TreeNode = {
        var n = nums.length
        if ( n < 1 ) null
        else {
            var i = nums.indices.maxBy(nums)
            var root = new TreeNode(nums(i))
            root.left = constructMaximumBinaryTree(nums.take(i))
            root.right = constructMaximumBinaryTree(nums.takeRight(n - 1 - i))
            root
        }
    }
}