class LRUCache {
    class Node
    {
        int val;
        int key;
        Node prev;
        Node next;
        Node(int key,int val)
        {
            this.key=key;
            this.val=val;
            prev=null;
            next=null;
        }
    }
    HashMap<Integer,Node> hm=new HashMap<>();
    int c;
    Node head;
    Node tail;
    

    public LRUCache(int capacity) {
        c=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) {
        if(!hm.containsKey(key)) return -1;
        else
        {
            Node n= hm.get(key);
            delete(n);
            addAtfirst(n);
            return n.val;
        }  
    }
    
    public void put(int key, int value) {
         if(hm.containsKey(key))
         {
            Node n= hm.get(key);
            n.val=value;
            delete(n);
            addAtfirst(n);
         }
         else
         {
            if(hm.size()==c)
            {
                hm.remove(tail.prev.key);
                delete(tail.prev);
            }
            Node n=new Node(key,value);
            hm.put(key,n);
            addAtfirst(n);
         }
        

        
    }
    public void addAtfirst(Node n)
    {
        Node nxt=head.next;
        head.next=n;
        n.prev=head;
        n.next=nxt;
        nxt.prev=n;

    }
    public void delete(Node n)
    {
        Node prevNode=n.prev;
        Node nxtNode=n.next;
        prevNode.next=nxtNode;
        nxtNode.prev=prevNode;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */