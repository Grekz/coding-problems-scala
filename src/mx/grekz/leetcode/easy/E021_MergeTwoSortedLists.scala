package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.ListNode

object E021_MergeTwoSortedLists {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
        if( l1 == null ){ return l2 }
        if( l2 == null ){ return l1 }
        var temp = new ListNode()
        var walk = temp
        var curL1 = l1
        var curL2 = l2
        while(curL1 != null && curL2 != null){
            if(curL1.x < curL2.x){
                walk.next = curL1
                curL1 = curL1.next
            }else{
                walk.next = curL2
                curL2 = curL2.next
            }
            walk = walk.next
        }
        if(curL1 == null){ walk.next = curL2 }
        if(curL2 == null){ walk.next = curL1 }
        return temp.next
    }
}