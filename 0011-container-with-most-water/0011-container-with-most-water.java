class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int area=0;
        int i=0; int j=height.length-1;
        
        while(i<j){
            int p1=i+1; int p2=j+1; 
            area = (p2-p1) * Math.min(height[i],height[j]);
            if(area>max)
                max=area;
            if(height[i]<height[j])
                ++i;
            else
                --j;
        }
        return max;
    }
}