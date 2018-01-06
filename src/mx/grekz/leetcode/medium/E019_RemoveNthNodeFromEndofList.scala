package mx.grekz.leetcode.medium

import mx.grekz.leetcode.helper.ListNode

object E019_RemoveNthNodeFromEndofList {
    def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
        if(head == null || n < 1) {
            return head
        }
        var ( i, size, walk ) = ( 0, 0, head )
        while(walk.next != null){
            size+=1
            walk = walk.next
        }
        var index = size - (n - 1)
        var headInner = head
        if(index < 1){
            headInner = headInner.next
            return headInner
        }
        walk = headInner
        while(walk.next != null){
            i+=1
            if(i == index){
                walk.next = walk.next.next
                return headInner
            }
            walk = walk.next
        }
        return headInner
    }
}