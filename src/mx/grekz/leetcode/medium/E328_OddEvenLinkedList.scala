package mx.grekz.leetcode.medium
import mx.grekz.leetcode.helper.ListNode
/**
 * @author grekz
 */
object E328_OddEvenLinkedList {
    def oddEvenList(head: ListNode): ListNode = {
        if ( head != null && head.next != null && head.next.next != null ) {
            var ( od, ev, evHe ) = ( head, head.next, head.next )
            while ( ev != null && ev.next != null ) {
                od.next = od.next.next
                ev.next = ev.next.next
                od = od.next
                ev = ev.next
            }
            od.next = evHe
        }
        head
    }
}