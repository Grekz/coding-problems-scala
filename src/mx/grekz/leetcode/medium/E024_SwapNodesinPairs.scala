package mx.grekz.leetcode.medium

import mx.grekz.leetcode.helper.ListNode

object E024_SwapNodesinPairs {
    def swapPairs(head: ListNode): ListNode = {
        var res = new ListNode()
        res.next = head
        var walk = res
        while( walk.next != null && walk.next.next != null ) {
            var a = walk.next
            var b = walk.next.next
            a.next = b.next
            b.next = a
            walk.next = b
            walk = a
        }        
        return res.next        
    }
}