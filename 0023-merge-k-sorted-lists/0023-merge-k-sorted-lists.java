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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((l1,l2)->l1.val-l2.val);
        if(lists.length==0) return null;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int i=0;i<lists.length;i++)
        {
            if(lists[i]!=null)
            pq.offer(lists[i]);
        }
        while(!pq.isEmpty())
        {
            ListNode curr=pq.poll();
            temp.next=curr;
            temp=temp.next;
            if(curr.next!=null) pq.add(curr.next);

        }
        return dummy.next;
        
        
    }
}