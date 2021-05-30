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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode node = new ListNode(0);
        ListNode cur = node;
        while(a != null && b != null) {
            if(a.val < b.val) {
                cur.next = a;
                a = a.next;
            } else {
                cur.next = b;
                b = b.next;
            }
            cur = cur.next;
        }
        if(a != null) {
            cur.next = a;
            a = a.next;
        }
        if(b != null) {
            cur.next = b;
            b = b.next;
        }
        return node.next;
    }
}
// Contributed by Amresh Ranjan.