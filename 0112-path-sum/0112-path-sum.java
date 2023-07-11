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
    Boolean flag=false;
    private void preorder(TreeNode root, int sum){
        if(root==null) return;
        if(root.left==null && root.right==null && sum-root.val==0) 
            flag=true;
        preorder(root.left,sum-root.val);
        preorder(root.right,sum-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        preorder(root,targetSum);
        return flag;   
    }
}