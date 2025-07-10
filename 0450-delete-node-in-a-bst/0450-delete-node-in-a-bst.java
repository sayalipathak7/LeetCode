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
        if(root==null)return root;
        if(root.val==key)
        {
            if(root.left==null && root.right==null)return null;
            else if(root.left==null || root.right==null)
            {
                if(root.left==null)return root.right;
                else return root.left;
            }
            else
            {
                TreeNode lm=findLeftMax(root.left);
                lm.right=root.right;
                return root.left;

            }

        }
        else if(key<root.val)
        {
            root.left=deleteNode(root.left,key);
        }
        else
        {
             root.right=deleteNode(root.right,key);
        }
        return root;
        
    }
    public  TreeNode findLeftMax(TreeNode root)
    {
        while(root.right!=null)
        {
            root=root.right;
        }
        return root;

    }
}