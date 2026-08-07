class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        Integer[] uniquekeys=new Integer[hm.size()];
        int i=0;
        for(int h:hm.keySet()){
            uniquekeys[i++]=h;
        }
        Arrays.sort(uniquekeys,(a,b) ->hm.get(b) - hm.get(a));
        int[] results=new int[k];
        for(int j=0;j<k;j++){
            results[j]=uniquekeys[j];
        }
        return results;
    }
}
