class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][]res=new int[m][n];
        if(m*n!=original.length) return new int[][]{};;
        for(int i=0;i<original.length;i++)
        {
            int r=i/n;
            int c=i%n;
            res[r][c]=original[i];
        }
        return res;
        
    }
}