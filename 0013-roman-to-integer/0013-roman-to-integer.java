class Solution {
        static Map<Character, Integer> values = new HashMap<>();
        static{
            values.put('M', 1000);
            values.put('D', 500);
            values.put('C', 100);
            values.put('L', 50);
            values.put('X', 10);
            values.put('V', 5);
            values.put('I', 1);
        }
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int sum=0;
        int i=0;
        while(i<arr.length){
            int current = values.get(arr[i]);
            int next=0;
            if(i+1<arr.length){
                next=values.get(arr[i+1]);
            }
            if(current<next){
                sum+=(next-current);
                i+=2;
            }else{
                sum+=current;
                i+=1;
            }
        }
        return sum;
    }
}