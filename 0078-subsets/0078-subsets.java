class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        subset(0, list, result, nums);
        return result;
    }
    
    public void subset(int first, LinkedList<Integer> list, List<List<Integer>> result, int[] nums) {
        result.add(new ArrayList<>(list));
        //System.out.println(result);
        
        for(int i=first;i<nums.length;i++) {
            list.add(nums[i]);
            subset(i+1, list, result, nums);
            list.removeLast();
        }
    }
}