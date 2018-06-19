package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E817_LinkedListComponents {

    def numComponents(_head: ListNode, G: Array[Int]): Int = {
        var res = 0
        var s = G.toSet
        var head = _head
        while ( head != null ) {
            if ( s.contains(head.x) && ( head.next == null || !s.contains(head.next.x) ) )
                res += 1
            head = head.next
        }
        res
    }
}