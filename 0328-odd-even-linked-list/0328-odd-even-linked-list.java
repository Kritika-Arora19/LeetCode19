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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        int i=1;
        ListNode s=head;
        ListNode dummy=new ListNode(0);
        ListNode dummy1=new ListNode(0);
        ListNode cur=dummy;
        ListNode cur1=dummy1;
        ListNode f=head;
        while(s!=null){
            if(i%2!=0){
                cur.next=new ListNode(s.val);
                cur=cur.next;
            }
            else{
                cur1.next=new ListNode(s.val);
                cur1=cur1.next;
                if(i==2)
                f=cur1;
            }
            i++;
            s=s.next;
        }
        cur.next=f;
        return dummy.next;
    }
}