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
    public int kthSmallest(TreeNode root, int k) {
        int cnt[]=new int[1];
        int num[]=new int[1];
        inorder(root,cnt,num,k);
        return num[0];
        
        
    }
    public void inorder(TreeNode root,int [] cnt,int[] num,int k)
    {
        if(root==null)return;
        inorder(root.left,cnt,num,k);
        cnt[0]=cnt[0]+1;
        if(cnt[0]==k) num[0]=root.val;
        inorder(root.right,cnt,num,k);
    }
}