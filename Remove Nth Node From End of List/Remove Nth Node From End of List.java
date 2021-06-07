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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ret_node = new ListNode(0);
        ret_node.next = head;
        
        ListNode slow = ret_node;
        ListNode fast = ret_node;
        
        for(int i = 1; i <= n+1; i++){
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return ret_node.next;
    }
}
// Contributed by Amresh Ranjan.