package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E653_TwoSumIVInputisaBST {
    def findTarget(root: TreeNode, k: Int): Boolean = {
        var s = scala.collection.mutable.Set[Int]()
        dfs(root, k, s)
    }
    def dfs(root: TreeNode, k: Int, s: scala.collection.mutable.Set[Int]): Boolean = {
        if ( root == null ) {
            false
        }else if ( s.contains(k - root.value) ) {
            true
        }else{
            s.add(root.value)
            dfs(root.left, k, s) || dfs(root.right, k, s)
        }
    }
}