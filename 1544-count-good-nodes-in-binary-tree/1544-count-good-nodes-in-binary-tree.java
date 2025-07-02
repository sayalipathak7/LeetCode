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
    public int goodNodes(TreeNode root) {
        if(root==null)return 0;
        int[] cnt=new int[1];
        goodNodes(root,root.val,cnt);
        return cnt[0];
        
    }
    public void goodNodes(TreeNode root,Integer max,int[] cnt) {
        if(root==null)return;
        if(root.val>=max)
        {
            cnt[0]=cnt[0]+1;
            max=root.val;
        }
        goodNodes(root.left,max,cnt);
        goodNodes(root.right,max,cnt);
    
    }
}