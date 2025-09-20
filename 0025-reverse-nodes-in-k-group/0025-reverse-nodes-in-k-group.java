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
        if(head==null)return null;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode oh=head,curr=head;
        ListNode nList=head;
        while(nList!=null)
        {
            for(int i=1;i<k;i++)
            {
                if(curr!=null)
                curr=curr.next;
                if(curr==null)
                {
                    temp.next=oh;
                    return dummy.next;
                }
            }
            nList=curr.next;
            curr.next=null;
            ListNode nHead=rev(oh);
            temp.next=nHead;
            temp=oh;
            oh=nList;
            curr=oh;
        }
        return dummy.next;

        
    }
    public ListNode rev(ListNode head)
    {
        if(head==null)return null;
        ListNode prev=head;
        ListNode curr=head.next;
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
}