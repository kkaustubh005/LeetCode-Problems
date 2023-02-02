class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x != 0){
            int pop = x%10; //taking the last digit
            x = x/10;  //removing the last digit, moving towards left digit
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && pop>7))
                return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && pop<-8))
                return 0;
            rev=rev*10+pop;   //Appending to the reverse number
        }
        return rev;
    }
}