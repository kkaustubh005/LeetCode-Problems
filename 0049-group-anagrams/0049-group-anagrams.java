class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        /* Time Limit Exceeded --------
        
        List<List<String>> fList = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            //System.out.println(i);
            if(strs[i]!=null){
            HashMap<Character,Integer> map = new HashMap<>();
            char[] cArray = strs[i].toCharArray();
            for(char x:cArray){
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                }else{
                    map.put(x,1);
                }
            }
                List<String> tList = new ArrayList<>();
                tList.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(strs[j]!=null){
                    HashMap<Character,Integer> tmap = new HashMap<>(); 
                    char[] tArray = strs[j].toCharArray();
                    for(char y:tArray){
                        if(tmap.containsKey(y)){
                            tmap.put(y,tmap.get(y)+1);
                        }else{
                            tmap.put(y,1);
                            }
                    }
                    if(map.equals(tmap)){
                        tList.add(strs[j]);
                        strs[j]=null;
                    }
                    }
                }
                fList.add(tList);
                strs[i]=null;
                
                
        }
    }
        return fList;*/
        
        if(strs.length==0) return new ArrayList();
        HashMap<String,List> map = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
        
    }
}