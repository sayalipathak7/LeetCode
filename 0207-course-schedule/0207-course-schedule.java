class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++) adj.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][1];
            int v=prerequisites[i][0];
            adj.get(u).add(v);
        }
        boolean[] v=new boolean[numCourses];
        boolean[] pv=new boolean[numCourses];
        for(int i=0;i<numCourses;i++) 
        {
            if(!v[i])
            {
               
                v[i]=true;
                pv[i]=true;
                if(dfs(i,v,pv,adj)) return false;
          
            }
            
        }
        
        return true;
        
    }
    public boolean dfs(int i,boolean[] v,boolean[] pv,ArrayList<ArrayList<Integer>> adj)
    {
        for(int n:adj.get(i))
        {
            if(v[n] && pv[n]) return true;
            if(!v[n])
            {
                v[n]=true;
                pv[n]=true;
                if(dfs(n,v,pv,adj))return true;
            }
            
        }
        pv[i]=false;
        return false;
    }
}