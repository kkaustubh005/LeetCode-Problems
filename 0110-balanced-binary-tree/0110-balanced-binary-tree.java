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
    boolean flag=true;
    private int check(TreeNode root) {
        if(root==null) 
            return 0;
        int left = check(root.left) + 1;
        int right = check(root.right) + 1;
        
        if(Math.abs(left-right)>1)
            flag=false;
        
        return Math.max(left,right);
        
    }
    public boolean isBalanced(TreeNode root) {
        check(root);
        return flag;
    }
}