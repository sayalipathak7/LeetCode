class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color==image[sr][sc]) return image;
        int n_r=image.length;
        int n_c=image[0].length;
        int [][]res=new int[n_r][n_c];
        for(int i=0;i<n_r;i++)
        {
            res[i]=image[i].clone();
        }
        int [][] t={{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]>q=new LinkedList<>();
        res[sr][sc]=color;
        q.offer(new int[]{sr,sc});
        while(!q.isEmpty())
        {
            int k[]=q.poll();
            int r=k[0];
            int c=k[1];
            for(int i=0;i<4;i++)
            {
                int row=r+t[i][0];
                int col=c+t[i][1];
                if(row>=0 && row<n_r && col>=0 && col<n_c && res[row][col]!=color) 
                {
                    if(image[row][col]==image[sr][sc])
                    {
                        res[row][col]=color;
                        q.offer(new int[]{row,col});

                    }
                }
            }
        }
        return res;
        
    }
}