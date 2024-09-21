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
        ListNode currOdd=head;
        if(head==null)
            return head;
         ListNode evenhead=head.next;
        ListNode currEven=head.next;
        
         
        while(currEven!=null && currOdd!=null)
        {
            System.out.println("currOdd"+currOdd.val);
            System.out.println("currEven"+currEven.val);
            if(currEven.next!=null)
            {
            currOdd.next=currEven.next;
             currOdd=currOdd.next;
            }
            else
                currOdd.next=null;
                
           // if(currOdd.next!=null)
            //{
               
               
               
           // }
             //if(currOdd.next!=null && currEven.next!=null)
                currEven.next=currOdd.next;
             //if(currEven.next!=null)
            //{
                currEven=currEven.next;
                   
           // }
          
                
            
             
            
        }
        currOdd.next=evenhead;
        return head;
        
    }
}