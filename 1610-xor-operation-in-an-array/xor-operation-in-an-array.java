class Solution {
    public int xorOperation(int n, int start) {
        int[] arr=new int[n];
        int sum1=0;
        for(int i=0;i<n;i++){
            arr[i]=start+2*i;
        }
        for(int i=0;i<n;i++){
            sum1=sum1^arr[i];

        }
        return sum1;
    }
}