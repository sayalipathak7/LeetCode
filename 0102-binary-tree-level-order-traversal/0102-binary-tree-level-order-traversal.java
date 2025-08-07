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
        List<List<Integer>> al=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return al;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode n=q.poll();
                a.add(n.val);
                if(n.left!=null)q.offer(n.left);
                if(n.right!=null)q.offer(n.right);
            }
            al.add(a);

        }


        return al;
    }
}