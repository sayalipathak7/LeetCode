class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res=new int[k][2];
        
        
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b) ->
            {
                int distA=a[0] *a[0]+ a[1]*a[1];
                int distB=b[0] *b[0]+ b[1]*b[1];
                return Integer.compare(distA, distB);

            }
        );
        for(int i=0;i<points.length;i++)
        {
            pq.offer(points[i]);
        }
        int i=0;
        while(i<k && !pq.isEmpty())
        {
            res[i]=pq.poll();
            i++;
        }

       return res;
        
    }
}