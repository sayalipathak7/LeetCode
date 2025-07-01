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
        rightSideView(root,res,0);

        return res;
        
    }
    public void rightSideView(TreeNode root,List<Integer> res,int lvl) {
        if(root==null)return;
        if(lvl==res.size())
        {
            res.add(root.val);
           // lvl=lvl+1;
        }
        rightSideView(root.right,res,lvl+1);
        rightSideView(root.left,res,lvl+1);

    }
}