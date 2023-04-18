class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
        
        /*
        //Not optimised for big numbers
        long x=1;
        long value=0;
        for(int i=digits.length-1;i>=0;i--){
            value = value+(digits[i]*x);
            // System.out.println(value);
            x=x*10;          
        }
        System.out.println(value);
        value=value+1;
        System.out.println(value);
        int v=0;
        long vLong=0;
        
        ArrayList<Integer> list = new ArrayList<>();
        while(value>0){
            vLong=value%10;
            v=(int)vLong;
            list.add(v);
            value=value/10;
        }
        int[] result = new int[list.size()];
        int length = list.size()-1;
        
        for(int j:list){
            result[length]=j;
            --length;
        }
        return result;*/
    }
}