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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
        return null;
        int l=0,i=1;
        ListNode cur=head;
        ListNode c=head;
        while(c!=null){
            l++;
            c=c.next;
        }
        int m=l/2;
        while(i<m){
            i++;
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
}