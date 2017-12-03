package mx.grekz.leetcode.medium
import mx.grekz.leetcode.helper.ListNode

object E002_AddTwoNumbers {
    def addTwoNumbers( l1: ListNode, l2: ListNode ): ListNode = {
        var res = new ListNode
        var ( head, ll1, ll2, sum, carry ) = ( res, l1, l2, 0, 0 )
        while ( carry > 0 || ll2 != null || ll1 != null ) {
            sum = carry
            carry = 0
            if ( ll1 != null ) {
                sum += ll1.x
                ll1 = ll1.next
            }
            if ( ll2 != null ) {
                sum += ll2.x
                ll2 = ll2.next
            }
            if ( sum > 9 ) {
                carry = 1
                sum -= 10
            }
            res.next = new ListNode( sum )
            res = res.next
        }
        return head.next
    }
}