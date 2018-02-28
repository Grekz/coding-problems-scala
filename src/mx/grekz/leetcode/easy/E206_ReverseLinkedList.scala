package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.ListNode

object E206_ReverseLinkedList {
    def reverseList(_head: ListNode): ListNode = {
        var head = _head
        var res :ListNode= null
        var cur :ListNode= null
        while( head != null ){
            cur=head;
            head=head.next;
            cur.next=res;
            res=cur;
        }
        return res;
    }  
}