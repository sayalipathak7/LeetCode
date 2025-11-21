class Solution {
    public int findCircleNum(int[][] isConnected) {
        int cnt=0;
        boolean[] v=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++)
        {
            if(!v[i])
            {
                cnt++;
                dfs(i,v,isConnected);

            }

        }
        return cnt;
        
    }
    public void dfs(int node, boolean[] v, int[][] isConnected)
    {
        v[node]=true;
        for(int i=0;i<isConnected.length;i++)
        {
            if(!v[i] && isConnected[node][i]==1)
            {
                v[i]=true;
                dfs(i,v,isConnected);
            }
        }

    }
}