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
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode r=q.poll();
            if(r==null)sb.append("#").append(",");
            else sb.append(r.val).append(",");
            if(r!=null)
            q.offer(r.left);
            if(r!=null)
            q.offer(r.right);
        }
        return sb.toString();

        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null)return null;
        String[] al= data.split(",");
        Queue<TreeNode> q=new LinkedList<>();
        int dt=Integer.parseInt(al[0]);
        TreeNode root=new TreeNode(dt);
        q.offer(root);
        int i=1;
        
        while(!q.isEmpty())
        {
            TreeNode r=q.poll();
            if(!al[i].equals("#"))
            {
                dt=Integer.parseInt(al[i]);
                r.left=new TreeNode(dt);
                q.offer(r.left);
            }
            if(!al[i+1].equals("#"))
            {
                dt=Integer.parseInt(al[i+1]);
                r.right=new TreeNode(dt);
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