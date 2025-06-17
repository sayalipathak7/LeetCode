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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        List<Integer> al;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            al=new ArrayList<>();
            for(int i=0;i<s;i++)
            {
                 TreeNode n=q.poll();
                  al.add(n.val);
                  if(n.left!=null) q.offer(n.left);
                  if(n.right!=null) q.offer(n.right);
            }
            res.add(al);

        }
        //System.out.println(al);

        return res;
        
    }
}