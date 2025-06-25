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
    int cnt=0,ans=-1;
    public int kthSmallest(TreeNode root, int k) {
      
        if(root==null) return 0;
        in(root,k);
        return ans;

    }
    public void in(TreeNode root, int k)
    {
        if(root==null) return;
        in(root.left,k);
        cnt++;
        if(cnt==k) ans= root.val;
        
        in(root.right,k);

    }
}