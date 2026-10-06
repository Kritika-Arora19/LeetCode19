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
    public ListNode swapNodes(ListNode head, int k) {
        int l=0;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode c=dummy;
        ListNode c1=dummy;
        while(head!=null){
            l++;
            head=head.next;
        }
        for(int i=1;i<k;i++)
        {
            c=c.next;
        }
        int temp=c.next.val;
        int f=l-k+1;
        for(int j=1;j<f;j++)
        {
            c1=c1.next;
        }
        int t=c1.next.val;
        c1.next.val=temp;
        c.next.val=t;
        return dummy.next;
    }
}