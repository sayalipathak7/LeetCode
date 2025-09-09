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
        if(head==null || head.next==null) return;
        ListNode slow=head,fast=head,prev=null;;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode h1=head;
        prev.next=null;
        ListNode h2=slow;
        ListNode newH2=reverse(h2);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(h1!=null && newH2!=null)
        {
            temp.next=h1;
            h1=h1.next;
            temp=temp.next;
            temp.next=newH2;
            newH2=newH2.next;
            temp=temp.next;
            
            
        }
        head=dummy.next; 
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null ||  head.next==null) return head;
        ListNode prev=head,curr=head.next;
        while(curr!=null)
        {
            ListNode nn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nn;
        }
        head.next=null;
        head=prev;
        return head;
    }
}