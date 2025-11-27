class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][1];
            int v=prerequisites[i][0];
            adj.get(u).add(v);
        }
        int []id=new int[numCourses];
        int []res;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            for(int n:adj.get(i))
            {
                id[n]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(id[i]==0)
            {
                q.offer(i);
            }
        }
        while(!q.isEmpty())
        {
            int n=q.poll();
            ans.add(n);
            for(int k:adj.get(n))
            {
                id[k]--;
                if(id[k]==0)
                {
                    q.offer(k);
                }
            }

        }
        if(ans.size()==numCourses)
        {
            res=new int[numCourses];
            int cnt=0;
            for(int n:ans)
            {
                res[cnt]=n;
                cnt++;
            }
            return res;

        }
        else
        return new int[]{};
         
    }
}