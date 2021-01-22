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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> st = new HashSet<>();
        ListNode cur = new ListNode(0);
        cur.next = head;
        while(cur.next != null){
            if(st.contains(cur)) return true;
            st.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur = new ListNode(0);
        cur.next = head;
        int depth = 0;
        for(int i = 0; i < 10010; i++){
            if(cur.next == null) return false;
            cur = cur.next;
        }
        return true;
    }
}

