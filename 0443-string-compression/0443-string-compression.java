class Solution {
    public int compress(char[] chars) {
        
        int count=0;
        StringBuilder sb = new StringBuilder();
        int i=0;
        
        while(i<chars.length){
            int j=i;
            while(j<chars.length && chars[j]==chars[i]){
                ++count;
                ++j;
            }
            sb.append(chars[i]);    
            if(count!=1)
                sb.append(count);
            count=0;
            i=j;
        }
        
        String res = sb.toString();
        char[] cArr = res.toCharArray();  
        
        for(int k=0;k<cArr.length;k++){
            chars[k]=cArr[k];
        }      
        
        return cArr.length;
    }
}