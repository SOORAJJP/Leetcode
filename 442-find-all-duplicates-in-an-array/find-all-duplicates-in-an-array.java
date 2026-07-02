class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>mp:hm.entrySet()){
            if(mp.getValue()>1){
                li.add(mp.getKey());
            }
        }
        return li;
    }
}