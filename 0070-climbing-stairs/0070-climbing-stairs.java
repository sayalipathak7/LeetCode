class Solution {
    // with recursion - Time Limit Exceeded
    // public int climbStairs(int n) {
    //     if(n==1 || n==2) return n;
    //     return climbStairs(n-1)+climbStairs(n-2);
        
    // }
    
    //==================================================================================================================================================
    
    // Top down - recursion + memoization
      public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int [] res=new int[n];
        res[0]=1;
        res[1]=2;
        return climbStairs(n,res);
      }
      public int climbStairs(int n,int [] res) {
       // if(n==1 || n==2) return n;
        if(res[n-1]!=0)
        {
            return res[n-1];
        }
        res[n-1]=climbStairs(n-1,res)+climbStairs(n-2,res);
        return res[n-1];

      }
}