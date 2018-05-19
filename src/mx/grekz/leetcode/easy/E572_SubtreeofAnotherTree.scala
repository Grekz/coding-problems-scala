package mx.grekz.leetcode.easy
import mx.grekz.leetcode.helper.TreeNode

/**
 * @author grekz
 */
object E572_SubtreeofAnotherTree {
    def isSubtree(s: TreeNode, t: TreeNode): Boolean = {
        if ( s == null ) false else isSame(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t)
    }
    
    def isSame( a:TreeNode, b:TreeNode ):Boolean = {
        if ( a == null && b == null )
            true
        else if ( a == null || b == null )
            false
        else
            a.value == b.value && isSame(a.left, b.left) && isSame(a.right, b.right)
    }
}