class Solution {
    public int[] runningSum(int[] nums) {
        int[] n1=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            n1[i]=sum;
        }
        return n1;
    }
}