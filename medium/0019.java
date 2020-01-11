/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        if(len == n) return head.next;
        temp = head;
        for(int i = 0; i < len - n - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
