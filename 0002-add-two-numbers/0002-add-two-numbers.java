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

        while(curr1!=null && curr2!=null)
        {
            sum=rem+curr1.val+curr2.val;
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
            curr1=curr1.next;
            curr2=curr2.next;
        }
        while(curr1!=null)
        {
            sum=rem+curr1.val;
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
            curr1=curr1.next;

        }
        while(curr2!=null)
        {
            sum=rem+curr2.val;
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
            curr2=curr2.next;
        }
        if(rem!=0)
        {
            ncurr=new ListNode(rem);
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
        }
        return nHead;
        
    }
}