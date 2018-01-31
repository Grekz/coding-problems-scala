package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.ListNode

object E083_RemoveDuplicatesfromSortedList {
  
    def deleteDuplicates(head: ListNode): ListNode = {
        if(head == null || head.next == null)
            return head;
        var walk = head;
        while(walk.next != null){
            if(walk.x == walk.next.x)
                walk.next = walk.next.next;
            else
                walk = walk.next;
        }
        return head;
    }
}