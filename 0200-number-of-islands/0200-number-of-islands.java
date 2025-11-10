class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        int n_of_rows=grid.length;
        int n_of_col=grid[0].length;
        int cnt=0;
        boolean[][] visited=new boolean[n_of_rows][n_of_col];
        for(int i=0;i<n_of_rows;i++)
        {
            for(int j=0;j<n_of_col;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    cnt++;
                     visited[i][j]=true;
                    bfs(i,j,n_of_rows,n_of_col,visited,grid);
                }

            }
        }
        return cnt;
        
    }
    public void bfs(int r,int c,int n_of_rows,int n_of_col,boolean[][] visited,char[][] grid)
    {
        int [][] t={{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[][]> q=new LinkedList<>();
        q.offer(new int[][]{{r,c}});
        while(!q.isEmpty())
        {
            int [][] k=q.poll();
            r=k[0][0];
            c=k[0][1];
            for(int i=0;i<4;i++)
            {
                int row=r+t[i][0];
                int col=c+t[i][1];
                if((row>=0 && row<n_of_rows) && (col>=0 && col<n_of_col) && grid[row][col]=='1' )
                {
                    if(!visited[row][col])
                    {
                        visited[row][col]=true;
                        q.offer(new int[][]{{row,col}});
                    }
                }
            }
        }
           

    }
}