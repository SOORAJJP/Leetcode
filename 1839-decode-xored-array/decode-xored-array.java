class Solution {
    public int[] decode(int[] encoded, int first) {
        int[]en=new int[encoded.length+1];
        en[0]=first;
        for(int i=0;i<en.length-1;i++){
            en[i+1]=en[i]^encoded[i];
        }
        return en;
    }
}