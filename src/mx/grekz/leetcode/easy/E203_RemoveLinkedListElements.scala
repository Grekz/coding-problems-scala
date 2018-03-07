package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.ListNode

object E203_RemoveLinkedListElements {
    def removeElements(head: ListNode, `val`: Int): ListNode = {
        if ( head == null ) return head
        var fh = new ListNode(-1)
        fh.next = head
        var cur = fh
        while ( cur.next != null )
            if ( cur.next.x == `val` )
                cur.next = cur.next.next
            else
                cur = cur.next
        fh.next
    }
}