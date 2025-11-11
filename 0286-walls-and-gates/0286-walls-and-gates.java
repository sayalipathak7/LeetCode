class Solution {
    public void wallsAndGates(int[][] rooms) {
        int nr=rooms.length;
        int nc=rooms[0].length;
        Queue<int[]> q=new LinkedList<>();
        int [][]t={{0,1},{0,-1},{1,0},{-1,0}};
        int time=0;
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                if(rooms[i][j]==0)
                {
                    q.offer(new int[]{i,j,time});
                }
            }
        }
        while(!q.isEmpty())
        {
            int a[]=q.poll();
            int r=a[0];
            int c=a[1];
            time=a[2];
            for(int i=0;i<4;i++)
            {
                int row=r+t[i][0];
                int col=c+t[i][1];
                time=a[2]+1;
                if(row>=0 && row<nr && col>=0 && col<nc && rooms[row][col]==2147483647)
                {
                    rooms[row][col]=time;
                    q.offer(new int[]{row,col,time});
                }

            }
        }
        

        
    }
}