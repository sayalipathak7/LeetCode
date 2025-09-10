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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1=l1;
        ListNode curr2=l2;
        int nodeVal=0,rem=0,sum=0;
        ListNode nHead=null,ncurr=null,prev=null;;

        while(curr1!=null || curr2!=null || rem!=0)
        {
            int c1=0;
            int c2=0;
            if(curr1==null) c1=0;
            else  c1=curr1.val;

            if(curr2==null) c2=0;
            else  c2=curr2.val;
            sum=rem+c1+c2;
           
            nodeVal=sum%10;
            rem=sum/10;
            ncurr=new ListNode(nodeVal);
            if(nHead==null)
            {
                nHead=ncurr;
                prev=ncurr;
            }
            else
            {
                prev.next=ncurr;
                prev=prev.next;
            }
            if(curr1!=null)
                curr1=curr1.next;
            if(curr2!=null)
                curr2=curr2.next;
        }
        return nHead;
        
    }
}