class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        int i=0;
        while(i<arr.length){
            if(arr[i]!='*')
                stack.push(arr[i]);
            else if(!stack.empty() && arr[i]=='*')
                stack.pop();
            ++i;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}