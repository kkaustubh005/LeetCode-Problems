class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String temp="";
        List<String> arr1 = new ArrayList<String>(Arrays.asList(arr));
        
        arr1.removeAll(Arrays.asList(""));
        String[] str = arr1.toArray(new String[arr1.size()]);
        int i=0;
        int j=str.length-1;
        
        while(i<j){
            temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            ++i;
            --j;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int a=0; a<str.length;a++){
            sb.append(str[a]);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}