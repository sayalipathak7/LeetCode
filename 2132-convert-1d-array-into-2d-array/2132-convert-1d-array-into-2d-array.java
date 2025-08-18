class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] grid=null;
        if(original.length>m*n || original.length<m*n ) return new int[][]{};;
        grid=new int[m][n];
        for(int i=0;i<original.length;i++)
        {
            int row=i/n;
            int col=i%n;
            grid[row][col]=original[i];

        }
        return grid;
        
    }
}