package mx.grekz.leetcode.easy
import mx.grekz.leetcode.helper.TreeNode
/**
 * @author grekz
 */
object E538_ConvertBSTtoGreaterTree {

    def convertBST(root: TreeNode): TreeNode = {
        var cur = 0
        def go(x: TreeNode): Unit = {
            if ( x == null ) return
            go(x.right)
            x.value += cur
            cur = x.value
            go(x.left)
        }
        go(root)
        root
    }
}