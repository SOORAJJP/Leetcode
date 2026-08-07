import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        
        List<Integer> li = new ArrayList<>(hs);
        Collections.sort(li); 
        int res; 
        if (li.size() >= 3) {
            res = li.get(li.size() - 3);
        } else {
            res = li.get(li.size() - 1); 
        }
        return res;
    }
}
