/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
       
        Queue<Node>q=new LinkedList<>();
        HashMap<Integer,Node> hm=new HashMap<>();
        int val=node.val;
        //List<Node> al=node.neighbors;
        q.offer(node);
        while(!q.isEmpty())
        {
            Node oldNode=q.poll();
            
            if(!hm.containsKey(oldNode.val))
            {
                Node newNode=new Node(oldNode.val);
                hm.put(oldNode.val,newNode);
            }
            List<Node> oldNb=oldNode.neighbors;
            for(Node nb:oldNb)
            {
                
                if(!hm.containsKey(nb.val))
                {
                    q.offer(nb);
                    Node newNodenb=new Node(nb.val);
                    hm.put(nb.val,newNodenb);

                }
                hm.get(oldNode.val).neighbors.add(hm.get(nb.val));

            }
        }
        return hm.get(node.val);
        
    }
}