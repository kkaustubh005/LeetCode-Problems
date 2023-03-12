class Solution {
    public boolean isValid(String s) {
        char[] cArray = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<cArray.length;i++){
            if(cArray[i] == '(')
                stack.push(cArray[i]);
            else if(cArray[i] == ')'){
                if(!stack.empty() && stack.peek() == '(') stack.pop();
                else return false;
            }
            else if(cArray[i] == '{')
                stack.push(cArray[i]);
            else if(cArray[i] == '}'){
                if(!stack.empty() && stack.peek() == '{') stack.pop();
                else return false;
            }  
            else if(cArray[i] == '[')
                stack.push(cArray[i]);
            else if(cArray[i] == ']'){
                if(!stack.empty() && stack.peek() == '[') stack.pop();
                else return false;
            }     
        }
        return stack.empty();
    }
}