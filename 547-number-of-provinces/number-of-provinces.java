class Solution {
    public int findCircleNum(int[][] con) {
        int n=con.length;
        int count=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                dfs(i,vis,con);
            }

        }
        return count;
    }
    public void dfs(int i,boolean[] vis,int[][]con){
        vis[i]=true;
        for(int j=0;j<con.length;j++){
            if(!vis[j] && con[i][j]==1){
                dfs(j,vis,con);
            }
        }
    }
}