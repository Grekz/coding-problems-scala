package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E876_MiddleoftheLinkedList {
    def middleNode(head: ListNode): ListNode = {
        def getSize(node: ListNode, n :Int) :Int = if ( node == null ) n else getSize(node.next, n + 1)
        def getKth(node: ListNode, k :Int, n :Int) :ListNode = if ( n == k ) node else getKth(node.next, k, n + 1)
        getKth(head, getSize(head, 0) / 2, 0)
    }
}