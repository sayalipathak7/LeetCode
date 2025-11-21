class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
        int a[][]={{0,1},{0,-1},{1,0},{-1,0}};
        boolean[][] v=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && !v[i][j])
                {
                    v[i][j]=true;
                    cnt++;
                    dfs(i,j,grid,v,a);
                }
            }
        }
        return cnt;
        
    }
    public void dfs(int r,int c,char[][] grid,boolean[][] v, int a[][])
    {
        for(int i=0;i<4;i++)
        {
            int row=r+a[i][0];
            int col=c+a[i][1];
            if(row>=0 && col>=0 && row<grid.length && col<grid[0].length &&  grid[row][col]=='1' && !v[row][col])
            {
                v[row][col]=true;
                dfs(row,col,grid,v,a);
            }
        }


    }
}