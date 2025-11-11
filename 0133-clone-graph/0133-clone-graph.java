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
        HashMap<Node,Node> hm=new HashMap<>();
        q.offer(node);
        while(!q.isEmpty())
        {
            Node oldNode=q.poll();
            
            if(!hm.containsKey(oldNode))
            {
                Node newNode=new Node(oldNode.val);
                hm.put(oldNode,newNode);
            }
            List<Node> oldNb=oldNode.neighbors;
            for(Node nb:oldNb)
            {
                
                if(!hm.containsKey(nb))
                {
                    q.offer(nb);
                    Node newNodenb=new Node(nb.val);
                    hm.put(nb,newNodenb);

                }
                hm.get(oldNode).neighbors.add(hm.get(nb));

            }
        }
        return hm.get(node);
        
    }
}