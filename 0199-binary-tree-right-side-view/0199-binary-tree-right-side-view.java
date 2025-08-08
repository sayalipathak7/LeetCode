/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
         Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            boolean isFirst=true;
            for(int i=0;i<s;i++)
            {
                TreeNode r=q.poll();
                if(isFirst)
                {
                    res.add(r.val);
                    isFirst=false;

                }
                if(r.right!=null)q.offer(r.right);
                if(r.left!=null)q.offer(r.left);

            }
            
        }
        return res;
        
    }
}