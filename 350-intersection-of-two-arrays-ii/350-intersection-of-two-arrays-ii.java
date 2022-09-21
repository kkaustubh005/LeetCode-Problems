class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int x:nums1){
//             list1.add(x);
//         }
//         for(int y:nums2){
//             list2.add(y);
//         }
//         int c=0;
//         for(int a:list1){
//             for(int b:list2){
//                 if(a==b){
//                     list.add(b);
//                     list2.remove(c);
//                     break;
//                 }
//                 ++c;
//             }
//             c=0;
//         }
        /*
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
        return result;*/
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
            for(int i=0;i<nums1.length;i++){
                if(map.containsKey(nums1[i])){
                    map.put(nums1[i],map.get(nums1[i])+1);
                }else{
                    map.put(nums1[i],1);
                }
            }
            for(int j=0;j<nums2.length;j++){
                if(map.containsKey(nums2[j]) && map.get(nums2[j])>=1){
                    map.put(nums2[j],map.get(nums2[j])-1);
                    list.add(nums2[j]);
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