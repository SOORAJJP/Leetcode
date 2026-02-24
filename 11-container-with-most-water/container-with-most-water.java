class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxarea=0;
        int area;
        while(i!=j){
            if(height[i]>height[j]){
                area=height[j]*(j-i);
                if(maxarea<area){
                    maxarea=area;
                }
                j--;
            }
            else{
                area=height[i]*(j-(i));
                if(maxarea<area){
                    maxarea=area;
                }
                i++;
            }
        }
        return maxarea;

    }
}