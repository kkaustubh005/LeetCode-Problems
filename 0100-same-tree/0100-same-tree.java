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
    public void preorder(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
            return;
        if(root1==null || root2==null){
            flag=false;
            return;
        }
        if(root1.val!=root2.val)
            flag=false;
        
        preorder(root1.left,root2.left);
        preorder(root1.right,root2.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        preorder(p,q);
        return flag;
    }
    
    /* //short method
        class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    // p and q are both null
    if (p == null && q == null) return true;
    // one of p and q is null
    if (q == null || p == null) return false;
    if (p.val != q.val) return false;
    return isSameTree(p.right, q.right) &&
            isSameTree(p.left, q.left);
  }
}
    */
}