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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        // return Math.max(maxDepth(root.left),maxDepth(root.right))+1;   

        // BFS
        Queue<TreeNode> q=new LinkedList<>();
        int cnt=0;
        q.offer(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            cnt++;
            for(int i=0;i<s;i++)
            {
                TreeNode n=q.poll();
                if(n.left!=null)q.offer(n.left);
                if(n.right!=null)q.offer(n.right);
            }


        }
        return cnt;
    }
}