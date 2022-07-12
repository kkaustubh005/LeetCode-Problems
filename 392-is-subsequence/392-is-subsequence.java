class Solution {
    public boolean isSubsequence(String s, String t) {
        // StringBuilder str = new StringBuilder(t);
        // for(int i=0;i<t.length();i++){
        //     char c = s.charAt(i);
        //     if()
        // }
        int temp=0;
        int counter=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            for(int j=temp;j<t.length();j++){
                char d = t.charAt(j);
                if(c==d){
                    temp=++j;
                    ++counter;
                    break;
                    
                    
                }
            }
        }
        if(counter==s.length()){
            return true;
        }else{
            return false;
        }
        
    }
}