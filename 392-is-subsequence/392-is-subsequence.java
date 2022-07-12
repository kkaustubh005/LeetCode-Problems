class Solution {
    public boolean isSubsequence(String s, String t) {
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
