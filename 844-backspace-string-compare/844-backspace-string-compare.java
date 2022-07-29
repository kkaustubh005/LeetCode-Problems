class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        
        for(char a:s.toCharArray()){
            if(a!='#'){
                sStack.push(a);
            }else if(!sStack.isEmpty()){
                sStack.pop();
            }
        }
        
        for(char b:t.toCharArray()){
            if(b!='#'){
                tStack.push(b);
            }else if(!tStack.isEmpty()){
                tStack.pop();
            }
        }
        
        return String.valueOf(sStack).equals(String.valueOf(tStack));
    }
}