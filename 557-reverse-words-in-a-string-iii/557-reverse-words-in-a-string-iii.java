class Solution {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] sArray= s.split(" ");
        for(int i=0;i<sArray.length;i++){
            String nstr="";
            for(int j=0;j<sArray[i].length();j++){
                char ch = sArray[i].charAt(j);
                nstr=ch+nstr;
            }
            builder.append(nstr);
            builder.append(" ");
        }
        builder.setLength(builder.length() - 1);
        return builder.toString();
    }
}