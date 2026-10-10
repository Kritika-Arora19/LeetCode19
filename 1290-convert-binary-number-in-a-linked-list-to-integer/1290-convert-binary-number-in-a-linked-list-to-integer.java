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
    public int getDecimalValue(ListNode head) {
        int k=0,ans=0;
        ListNode temp=head;
        while(temp!=null){
            k++;
            temp=temp.next;
        }
        int s=k-1;
        while(head!=null){
            int r=head.val;
            ans+=r*Math.pow(2,s);
            s--;
            head=head.next;
        }
        return ans;
    }
}
/*        while(head!=null){
            int r=head.val;
            s=s*10+r;
            head=head.next;
        }
        while(s!=0){
            int rem=s%10;
            ans+=rem*Math.pow(2,k);
            s=s/10;
            k++;
        }
        return ans;
    }
}*/