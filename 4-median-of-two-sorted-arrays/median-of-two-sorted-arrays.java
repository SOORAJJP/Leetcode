class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[] new1=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            new1[k++]=nums1[i];
        }
        for(int j=0;j<n;j++){
            new1[k++]=nums2[j];
        }
        Arrays.sort(new1);
        int l=new1.length;
        if(l%2!=0){
            return new1[l/2];
        }
        else{
            return ((new1[(l/2)-1]+new1[(l/2)])/2.0);
        }

}
}