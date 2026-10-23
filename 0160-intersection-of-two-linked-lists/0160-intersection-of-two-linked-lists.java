/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        // Loop runs until the two pointers meet
        while (a != b) {
            // If pointer 'a' reaches the end, redirect it to headB; else move to next
            a = (a == null) ? headB : a.next;
            
            // If pointer 'b' reaches the end, redirect it to headA; else move to next
            b = (b == null) ? headA : b.next;
        }

        // Returns either the intersection node or null if they never intersect
        return a; 
    }
}