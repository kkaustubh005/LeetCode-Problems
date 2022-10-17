class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            if(!set.contains(sentence.charAt(i)))
                set.add(sentence.charAt(i));
            // }else{
            //     System.out.println(sentence.charAt(i));
            //     return false;
            // }
        }
        if(set.size()<26) return false;
        return true;
    }
}