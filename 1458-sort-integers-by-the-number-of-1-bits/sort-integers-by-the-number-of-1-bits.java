class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int n1=Integer.bitCount(arr[i]);
                int n2=Integer.bitCount(arr[j]);
                if(n1>n2 || (n1==n2 && arr[i]>arr[j])){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        return arr;
    }
}