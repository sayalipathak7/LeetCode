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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val==key)
        {
            if(root.left==null && root.right==null) return null;
            else if(root.right==null) return root.left;
            else if(root.left==null) return root.right;
            else
            {
                TreeNode lmax=findLeftMax(root.left);
                lmax.right=root.right;
                return root.left;
            }


        }
        else if(root.val<key)
        {
            root.right=deleteNode(root.right,key);

        }
        else
        {
            root.left=deleteNode(root.left,key);

        }
        return root;
        
    }
    public TreeNode findLeftMax(TreeNode t)
    {
        while(t.right!=null)
        {
            t=t.right;
        }
        return t;

    }
}