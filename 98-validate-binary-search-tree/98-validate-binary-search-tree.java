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
class Solution { //top-down DFS 
    public boolean check(TreeNode root, Integer low, Integer high){
        if(root==null) return true;
        
        if((low!=null && root.val<=low) || (high!=null && root.val>=high)){
            return false;
        }
        
        return check(root.left, low, root.val) && check(root.right, root.val, high);
    }
    
    public boolean isValidBST(TreeNode root) {
        return check(root, null, null);    
    }
}