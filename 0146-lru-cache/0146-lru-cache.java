class Node
{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int k,int v)
    {
        key=k;
        val=v;
        next=null;
        prev=null;
    }
}
class LRUCache {
    HashMap<Integer,Node> hm=new HashMap<>();
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
   

    int cap=0;

    public LRUCache(int capacity) {
        cap=capacity;
         head.next=tail;
        tail.prev=head;

    }

    public void add(Node n)
    {
        Node nxt=head.next;
        head.next=n;
        n.prev=head;
        n.next=nxt;
        nxt.prev=n;
        

    }
    public void delete(Node n)
    {
        Node p=n.prev;
        p.next=n.next;
        n.next.prev=p;
        
    }
    
    public int get(int key) {
        if(hm.containsKey(key))
        {
            Node n=hm.get(key);
            delete(n);
            add(n);
            return n.val;
        }
        else
            return -1;   
        
    }
    
    public void put(int key, int value) {
         if(hm.containsKey(key))
         {
            Node n=hm.get(key);
            n.val=value;
            delete(n);
            add(n);
         }
         else
         {
            if(hm.size()>=cap)
            {
                hm.remove(tail.prev.key);
                delete(tail.prev);
                
            }
            Node n= new Node(key,value);
            add(n);
            hm.put(key,n);

         }
       
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */