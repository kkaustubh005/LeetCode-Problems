class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
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
        return true;
    }
}