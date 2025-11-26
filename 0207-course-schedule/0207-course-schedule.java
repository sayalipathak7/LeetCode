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

        ArrayList<Integer> res=new ArrayList<>();
        int[] id=new int[numCourses];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
           for(int n :adj.get(i)) 
           id[n]++;
        }
        for(int i=0;i<numCourses;i++)
        {
            if(id[i]==0)
            q.offer(i);
        }
        while(!q.isEmpty())
        {
            int n=q.poll();
            res.add(n);
            for(int i:adj.get(n))
            {
           
                 id[i]--;
                if(id[i]==0)
                q.offer(i);
            }
        }
        
        if(res.size()==numCourses)return true;
        return false;
        
    }
}