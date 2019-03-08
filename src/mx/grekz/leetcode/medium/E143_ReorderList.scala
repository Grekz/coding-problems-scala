package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E143_ReorderList {
    def reorderList(head: ListNode): Unit = {
        if ( head != null && head.next != null){
            var slow = head
            var fast = head
            var cur = head
            while ( fast.next != null && fast.next.next != null ) {
                slow = slow.next
                fast = fast.next.next
            }
            fast = slow.next
            while (fast.next != null) {
                cur = fast.next
                fast.next = cur.next
                cur.next = slow.next
                slow.next = cur
            }
            fast = slow.next
            cur = slow
            slow = head
            while ( slow != cur ) {
                cur.next = fast.next
                fast.next = slow.next
                slow.next = fast
                slow = fast.next
                fast = cur.next
            }
        }
    }
}