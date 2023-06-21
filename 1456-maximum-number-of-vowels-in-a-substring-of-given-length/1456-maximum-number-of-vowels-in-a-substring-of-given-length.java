class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=Integer.MIN_VALUE;
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        for(int i=0;i<k;i++){
            if(set.contains(arr[i]))
                ++count;
        }
        max=count;
        for(int i=k;i<arr.length;i++){
            if(set.contains(arr[i]))
                ++count;
            if(set.contains(arr[i-k]))
                --count;
            if(count>max)
                max=count;
        }
        return max;  
    }
}