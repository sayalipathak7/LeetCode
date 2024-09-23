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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return true;
        }
        ListNode curr=head;
        int cnt=0;
        while(curr!=null)
        {
            cnt++;
            curr=curr.next;
            
        }
        System.out.println("cnt"+cnt);
        curr=head;
        int mid=cnt/2;
        System.out.println("mid"+mid);
        int i=0;
        while(i<mid-1)
        {
            curr=curr.next;
            i=i+1;
            System.out.println("i"+i);
        }
         System.out.println("curr"+curr.val);
        // System.out.println("curr.next"+curr.next.val);
        
        ListNode newhead=curr.next;
        curr.next=null;
        System.out.println("newhead"+newhead.val);
        ListNode secondhalf =reverse(newhead);
         ListNode firsthalf =head;
        System.out.println("secondhalf"+secondhalf.val);
        while(firsthalf!=null &&secondhalf!=null)
        {
            if(firsthalf.val!=secondhalf.val)
            {
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
        return true;
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}