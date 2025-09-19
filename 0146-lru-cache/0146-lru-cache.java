class Node
{
    int val;
    int key;
    Node next;
    Node prev;
    Node(int k,int v)
    {
        key=k;
        val=v;
    }

}
class LRUCache {
    Node head;
    Node tail;
    int cap;
    HashMap<Integer,Node> hm=new HashMap<>();

    public LRUCache(int capacity) {
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        cap=capacity;   
    }
    public void add(Node n)
    {
        Node nn=head.next;
        n.next=nn;
        nn.prev=n;
        head.next=n;
        n.prev=head;

    }
    public void delete(Node n)
    {
        Node p=n.prev;
        Node nn=n.next;
        p.next=nn;
        nn.prev=p;

    }
    
    public int get(int key) {
        if(hm.containsKey(key))
        {
            Node n=hm.get(key);
            int val=n.val;
            delete(n);
            add(n);
            return val;

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
            Node n=new Node(key,value);
            if(hm.size()>=cap)
            {
                hm.remove(tail.prev.key);
                delete(tail.prev);
                
            }
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