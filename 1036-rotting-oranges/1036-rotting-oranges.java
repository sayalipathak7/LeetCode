class Solution {
    public int orangesRotting(int[][] grid) {
        int nr=grid.length;
        int nc=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        int time=0;
        boolean[][] visited=new boolean[nr][nc];
        int[][]t={{0,1},{0,-1},{1,0},{-1,0}};
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j,time});
                    visited[i][j]=true;
                }
            }
        }
        while(!q.isEmpty())
        {
            int []a=q.poll();
            time=a[2];
            int row=a[0],col=a[1];
            for(int i=0;i<4;i++)
            {
                int r=row+t[i][0];
                int c=col+t[i][1];
                if(r>=0 && r<nr && c>=0 && c<nc && !visited[r][c] && grid[r][c]==1)
                {
                    visited[r][c]=true;
                    grid[r][c]=2;
                    q.offer(new int[]{r,c,time+1});

                }
            }

        }
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                if(grid[i][j]==1)
                return -1;
            }
        }
        return time;


        
    }
}