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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }

        ListNode s=head;
        ListNode f=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode prev = null;
        ListNode curr = s;

//reversing the ll from mid to end
    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    ListNode first = head;
    ListNode second = prev;

    while(second.next!=null){
        ListNode temp=first.next;
        first.next=second;
        first=temp;
        ListNode temp1=second.next;
        second.next=first;
        second=temp1;
    }
    
    }
}