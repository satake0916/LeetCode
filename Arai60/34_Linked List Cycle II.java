/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> st = new HashSet<>();
        while(head != null){
            if(st.contains(head)) return head;
            st.add(head);

            if(head.next == null) return null;
            head = head.next;
        }
        return null;
    }
}
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
            if(fast == head) return head;
        }
        return null;
    }
}
