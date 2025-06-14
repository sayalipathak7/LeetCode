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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==0 || k==1)return head;
        ListNode dummy=new ListNode(0);
        ListNode ktail=dummy;
        dummy.next=head;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode kthNode=getKthNode(temp,k);
            if(kthNode ==null)
            {
                ktail.next=temp;
                break;

            }
            else
            {
                ListNode kthNext=kthNode.next;
                kthNode.next=null;
                ListNode revHead=reverse(temp);
                ktail.next=revHead;
                ktail=temp;
                temp=kthNext;

            }
        }
        return dummy.next;
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head.next;
        ListNode prev=head;
        while(curr!=null)
        {
            ListNode nn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nn;
        }
        head.next=null;
        return prev;

    }
    public ListNode getKthNode(ListNode head, int k)
    {
        for(int i=1;i<k;i++)
        {
            head=head.next;
            if(head==null) return null;
             
        }
        return head;

    }
}