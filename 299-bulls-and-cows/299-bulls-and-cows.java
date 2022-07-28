class Solution {
    public String getHint(String secret, String guess) {
        char[] s= secret.toCharArray();
        char[] g= guess.toCharArray();
        int equalCount=0;
        int unMatchedCount=0;
        HashMap<Character, Integer> sMap= new HashMap<>();
        HashMap<Character, Integer> gMap= new HashMap<>();
        
        for(char a:s){
            if(sMap.containsKey(a)){
                sMap.put(a,sMap.get(a)+1);
            }else{
                sMap.put(a,1);
            }
        }
        
        for(char b:g){
            if(gMap.containsKey(b)){
                gMap.put(b,gMap.get(b)+1);
            }else{
                gMap.put(b,1);
            }
        }
        
        for(int i=0;i<secret.length();i++){
            if(s[i]==g[i]){
                ++equalCount;
                sMap.put(s[i],sMap.get(s[i])-1);
                if(sMap.get(s[i])==0){ 
                    sMap.remove(s[i]);
                }
                gMap.put(g[i],gMap.get(g[i])-1);
                if(gMap.get(g[i])==0){
                    gMap.remove(g[i]);
                }
            }
        }
            for(char x: sMap.keySet()){
                if(gMap.containsKey(x)){
                    int min=Math.min(sMap.get(x),gMap.get(x));
                    unMatchedCount=unMatchedCount+min;
                }
            }
        
        String bull=Integer.toString(equalCount);
        char a='A';
        String cow=Integer.toString(unMatchedCount);
        char b='B';
        StringBuilder str = new StringBuilder(4);
        str.append(bull);
        str.append("A");
        str.append(cow);
        str.append("B");
        
        return str.toString();
    }
}