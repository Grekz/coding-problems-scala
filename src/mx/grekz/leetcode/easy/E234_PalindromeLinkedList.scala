package mx.grekz.leetcode.easy

import mx.grekz.leetcode.helper.ListNode
/**
 * @author grekz
 */
object E234_PalindromeLinkedList {

    def isPalindrome(head: ListNode): Boolean = {
        if(head == null || head.next == null) return true;
        if(head.next.next == null) return head.next.x == head.x;
        var (fast, slow) = (head,head)
        var rev : ListNode = null
        while ( fast != null && fast.next != null ) {
            fast = fast.next.next;
            var tmp = slow;
            slow = slow.next;
            tmp.next = rev;
            rev = tmp;
        }
        // if is odd
        if ( fast != null ) {
            slow = slow.next;
        }
        while ( rev != null && rev.x == slow.x ){
            rev = rev.next;
            slow = slow.next;
        }
        rev == null;
    }
}