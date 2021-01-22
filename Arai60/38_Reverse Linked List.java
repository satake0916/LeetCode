/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = null;
        while(head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = cur;
            cur = temp;
            head = head.next;
        }
        return cur;
    }
}
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        var cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
