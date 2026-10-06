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
        if(head.next==null && n==1)
        return null;
        int l=0;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode cur=dummy;
        while(head!=null){
            l++;
            head=head.next;
        }
        int f=l-n+1;
        for(int i=1;i<f;i++){
            cur=cur.next;
        }   
        cur.next=cur.next.next;
        return dummy.next;
    }
}