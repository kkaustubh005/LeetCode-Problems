class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
      
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        while(i<j){
            if(set.contains(arr[i]) && set.contains(arr[j])){
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                ++i;--j;
            }else if(!set.contains(arr[i])){
                ++i;
            }else if(!set.contains(arr[j])){
                --j;
            }
        }
        return String.valueOf(arr);
    }
}