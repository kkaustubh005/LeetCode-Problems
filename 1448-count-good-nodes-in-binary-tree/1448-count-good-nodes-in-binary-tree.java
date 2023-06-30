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
    private int count=0;
    private int max;
    //private int initial= root.val;
    private void preorder(TreeNode root,int max,int initial){
        if(root==null) return;
        if(root.val>=max){
            ++count;
            max=root.val;
        }
        // if(root.left==null && root.right==null)
        //     max=initial;
        preorder(root.left,max,root.val);
        preorder(root.right,max,root.val);
        
    }
    public int goodNodes(TreeNode root) {
        preorder(root,root.val,root.val);
        return count;
    }
}