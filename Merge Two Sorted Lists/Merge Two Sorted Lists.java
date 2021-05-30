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
        if(a == null) return b; 
        if(b == null) return a; 
          
        if(a.val < b.val)  
        { 
            a.next = mergeTwoLists(a.next, b); 
            return a; 
        } 
        else 
        { 
            b.next = mergeTwoLists(a, b.next); 
            return b; 
        } 
    }
} // Contributed by Amresh Ranjan.