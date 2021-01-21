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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        
        Set<Integer> st = new HashSet<>();
        Set<Integer> rm = new HashSet<>();
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy.next;
        while(true){
            int t = cur.val;
            if(st.contains(t)) rm.add(t);
            st.add(t);
            if(cur.next == null) break;
            cur = cur.next;
        }
        
        cur = dummy;
        while(true){
            int t = cur.next.val;
            if(rm.contains(t)){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
            if(cur.next == null) break;
        }
        
        return dummy.next;
    }
}
