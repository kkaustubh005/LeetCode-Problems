/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();
        
        if(root==null) return output;
        
        stack.add(root);
        while(!stack.isEmpty()){
            Node current = stack.pop();
            output.add(current.val);
            for(int i=current.children.size()-1;i>=0;i--){
                stack.push(current.children.get(i));
            }
        }
        return output;
    }
}