class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int i:candies)
            if(i>max) max=i;
        
        ArrayList<Boolean> result = new ArrayList<>(candies.length-1);
        
        for(int j:candies){
            if(j+extraCandies>=max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}