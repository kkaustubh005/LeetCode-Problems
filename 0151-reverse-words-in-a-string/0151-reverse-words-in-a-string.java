class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int i=0;
        
        String temp="";
        //ArrayList<String> arr1 = Arrays.asList(arr);
        List<String> arr1 = new ArrayList<String>(Arrays.asList(arr));
        
        arr1.removeAll(Arrays.asList(""));
        System.out.println(arr1);
        // for(int x=0;x<arr1.size();x++){
        //     if(arr1.get(" ")){
        //         //arr1.remove(arr[x]);
        //         System.out.println("Yo");
        //     }
        // }
        
        // for(String b:arr1){
        //     if(b==" ")
        //         arr1.remove(b);
        // }
        //System.out.println(arr1);
        
        String[] str = arr1.toArray(new String[arr1.size()]);
        int j=str.length-1;
        while(i<j){
            temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            ++i;
            --j;
        }
        
        
        //System.out.println(arr.length);
        
        StringBuilder sb = new StringBuilder();
        for(int a=0; a<str.length;a++){
            // if(arr[a]==" ")
            //     continue;
            sb.append(str[a]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
        sb.deleteCharAt(sb.length()-1);
        //sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}