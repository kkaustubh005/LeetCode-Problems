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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        if(root==null) 
            return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=0;
        
        while(!q.isEmpty()) {
            int qSize = q.size();
            list.add(new ArrayList<Integer>());
            
            while(qSize>0) {
                qSize--;
                TreeNode node = q.remove();
                list.get(level).add(node.val);
                
                if(node.left!=null)
                    q.add(node.left);
                
                if(node.right!=null)
                    q.add(node.right);  
            }
            if(level%2!=0)
                Collections.reverse(list.get(level));
            ++level;
        }
        return list;
    }
}