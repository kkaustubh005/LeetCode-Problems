class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] sArray = s.toCharArray();
        char[] pArray = p.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        int len = p.length();
        int size = s.length()-len;
        //System.out.println(size);
        
        //storing p string in hash map
        Map<Character, Integer> map = new HashMap<>();
        for(int x=0;x<len;x++){
            if(map.containsKey(pArray[x])){
                    map.put(pArray[x],map.get(pArray[x])+1);
            }else{
                map.put(pArray[x],1);
                }
        }
        
        Map<Character, Integer> sMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            //System.out.println(i);
            //Set<Character> set = new HashSet<>();
            //Map<Character, Integer> map = new HashMap<>();
            
            /*
            for(int x=0;x<len;x++){ 
                //set.add(pArray[x]);
                //System.out.println("x- "+x);
                if(map.containsKey(pArray[x])){
                    map.put(pArray[x],map.get(pArray[x])+1);
                }else{
                map.put(pArray[x],1);
                }
                //System.out.println(pArray[x]+"-"+ map.get(pArray[x]));
            }*/    
            if(sMap.containsKey(sArray[i])){
                sMap.put(sArray[i],sMap.get(sArray[i])+1);
            }else{
                sMap.put(sArray[i],1);
            }
            
            if(i>=len){
                if(sMap.get(sArray[i-len])==1){
                    sMap.remove(sArray[i-len]);
                }else{
                    sMap.put(sArray[i-len],sMap.get(sArray[i-len])-1);
                }
            }
            
            if(sMap.equals(map)){
                list.add(i-len+1);
            }
            
            
            /*
            for(int j=i;j<i+len;j++){
                // if(set.contains(sArray[j])){
                //     set.remove(sArray[j]);
                // }
                if(map.containsKey(sArray[j])){
                    map.put(sArray[j],map.get(sArray[j])-1);
                    map.remove(sArray[j],0);
                }
            }
            if(map.size()==0){
                list.add(i);
            }   
            map.clear();
        }
        return list;*/
            
    }
        return list;
}
}