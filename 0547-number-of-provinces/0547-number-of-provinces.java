class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean []v=new boolean[isConnected.length];
        int cnt=0;
        for(int i=0;i<isConnected.length;i++)
        {
            if(!v[i])
            {
                cnt++;
                bfs(i,v,isConnected);
            }
        }
        return cnt;
        
    }
    public void bfs(int node, boolean []v,int[][] isConnected)
    {
        Queue<Integer> q=new LinkedList<>();
        q.offer(node);
         v[node]=true;
        while(!q.isEmpty())
        {
            int n=q.poll();
           
            for(int i=0;i<isConnected.length;i++)
            {
                if(isConnected[n][i]==1 && !v[i])
                {
                    v[i]=true;
                    q.offer(i);
                }
            }
        }
    }
}