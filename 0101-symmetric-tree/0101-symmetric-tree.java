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
    Boolean flag=true;
    void traversal(TreeNode left, TreeNode right) {
        if(left==null && right==null) 
            return;
        if(left==null || right==null){
            flag=false;
            return;
        }
        if(left.val!=right.val){
            flag=false;
            return;
        }
        traversal(left.left, right.right);
        traversal(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        traversal(root.left, root.right);
        return flag;
    }
}