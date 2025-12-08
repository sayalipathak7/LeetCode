class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int[] dp=new int[n];
        dp[0]=1;
        dp[1]=2;
        return climbStairs(n,dp);
       
    }
    public int climbStairs(int n,int[] dp) {
         if(dp[n-1]!=0) return dp[n-1];
        dp[n-1]=climbStairs(n-1,dp)+climbStairs(n-2,dp);
        return dp[n-1];

    }
}