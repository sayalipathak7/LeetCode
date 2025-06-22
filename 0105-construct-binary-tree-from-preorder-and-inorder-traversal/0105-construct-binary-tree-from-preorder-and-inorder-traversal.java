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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            hm.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hm);
        
    }
    public TreeNode buildTree(int[] preorder,int ps,int pe, int[] inorder,int is,int ie, HashMap<Integer,Integer>hm)
    {
        if(ps>pe || is>ie) return null;
        int idx=hm.get(preorder[ps]);
        int left_length=idx-is;
        TreeNode root=new TreeNode(preorder[ps]);
        root.left=buildTree(preorder,ps+1,ps+left_length,inorder,is,idx-1,hm);
        root.right=buildTree(preorder,ps+left_length+1,pe,inorder,idx+1,ie,hm);
        return root;

    }
}