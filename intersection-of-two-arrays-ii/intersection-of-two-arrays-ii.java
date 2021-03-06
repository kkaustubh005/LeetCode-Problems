class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ++i;
            }else if(nums1[i]>nums2[j]){
                ++j;
            }else{
                list.add(nums1[i]);
                ++i;
                ++j;
            }
        }
        int[] result = new int[list.size()];
        int count=0;
        for(int res:list){
           result[count] = res;
            ++count;
        }
        return result;
    }
}
