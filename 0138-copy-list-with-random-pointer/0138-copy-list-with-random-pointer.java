/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node curr=head;
        Node newHead=null;
        Node ncurr=null,prev=null;
        HashMap<Node,Node> hm=new HashMap<>();
        while(curr!=null)
        {
            ncurr=new Node(curr.val);
            if(newHead==null)
            {
                newHead=ncurr;
                prev=ncurr;
            }
            else
            {
                prev.next=ncurr;
                prev=prev.next;
            }
                
            hm.put(curr,ncurr);
            curr=curr.next;
        }
       // System.out.println(hm.toString());
        curr=head;
        ncurr=newHead;

        // while(ncurr!=null)
        // {
        //     System.out.println(ncurr.val +" is "+ncurr);
        //   ncurr=ncurr.next;  
        // }



        while(curr!=null)
        {
            Node rm=curr.random;
            // System.out.println(curr.val +"rm is - "+curr.random);
            Node nrm=hm.get(curr.random);
           // System.out.println(ncurr.val +"nrm is - "+nrm);
            ncurr.random=hm.get(curr.random);
            
            curr=curr.next;
            ncurr=ncurr.next;  
        }


        return newHead;
    }
}