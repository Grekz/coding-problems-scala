package mx.grekz.leetcode.hard

import mx.grekz.leetcode.helper.ListNode

object E023_MergekSortedLists {  
    def mergeKLists(lists: Array[ListNode]): ListNode = {
        return merge( lists, 0, lists.length - 1 );
    }
    def merge(lists: Array[ListNode], ini: Int, las: Int): ListNode = {
        if ( ini > las ) { return null; }
        if ( ini == las ) { return lists(ini); }
        var mid :Int = ( ini + las ) / 2;
        var a = merge(lists, ini, mid) 
        var b = merge(lists, mid+1, las)
        var tmp = new ListNode(0) 
        var cur = tmp
        while ( a != null && b != null ) {
            if ( a.x < b.x ) {
                cur.next = a;
                a = a.next;
            }else{
                cur.next = b;
                b = b.next;                
            }
            cur = cur.next;
        }
        cur.next = if ( a != null ) a else b;
        return tmp.next;
    }
}