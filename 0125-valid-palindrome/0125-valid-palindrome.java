class Solution {
    public boolean isPalindrome(String s) {
       /* s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]", "");
        //System.out.println(s);
        char[] array = s.toCharArray();
        int i=0;
        int j=array.length-1;
        while(i<j){
            if(array[i]==array[j]){
                ++i;
                --j;
            }else{
                return false;
            }
        }
        return true;*/
        //Alternate approach- Using Stack
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(stack.pop());
        }
        if(s.equals(sb.toString()))
            return true;
        else
            return false;
        
    }
}