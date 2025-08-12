/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return null;
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode r=q.poll();
            if(r==null) sb.append("#").append(",");
            else sb.append(r.val).append(",");
            if(r!=null)
            { 
                q.offer(r.left);
                q.offer(r.right);

            }
           
        }
        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null)return null;
        Queue<TreeNode> q=new LinkedList<>();
        String [] s=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(s[0]));
        q.offer(root);
        int i=1;
        while(!q.isEmpty())
        {
            TreeNode r=q.poll();
            if(!s[i].equals("#"))
            {
                r.left=new TreeNode(Integer.parseInt(s[i]));
                 q.offer(r.left);
            }
                
            if(!s[i+1].equals("#"))
            {
                r.right=new TreeNode(Integer.parseInt(s[i+1]));
                q.offer(r.right);
            }
            i=i+2;
        }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));