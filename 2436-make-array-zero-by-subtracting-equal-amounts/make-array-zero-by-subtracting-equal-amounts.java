class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) s.add(nums[i]);
        }
        return s.size();
    }
}