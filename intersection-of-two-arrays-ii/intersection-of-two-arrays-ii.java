class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for(int x:nums1){
            list1.add(x);
        }
        for(int y:nums2){
            list2.add(y);
        }
        int c=0;
        for(int a:list1){
            for(int b:list2){
                if(a==b){
                    list3.add(b);
                    list2.remove(c);
                    break;
                }
                ++c;
            }
            c=0;
        }
        int[] result = new int[list3.size()];
        int count=0;
        for(int res:list3){
           result[count] = res;
            ++count;
        }
        return result;
    }
}