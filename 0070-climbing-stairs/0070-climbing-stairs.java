class Solution {
    // with recursion - Time Limit Exceeded tc - 2 ^n sc - n
    // public int climbStairs(int n) {
    //     if(n==1 || n==2) return n;
    //     return climbStairs(n-1)+climbStairs(n-2);
        
    // }
    
    //==================================================================================================================================================
    
    // Top down - recursion + memoization  tc -n sc- n
    //   public int climbStairs(int n) {
    //     if(n==1 || n==2) return n;
    //     int [] res=new int[n];
    //     res[0]=1;
    //     res[1]=2;
    //     return climbStairs(n,res);
    //   }
    //   public int climbStairs(int n,int [] res) {
    //    // if(n==1 || n==2) return n;
    //     if(res[n-1]!=0)
    //     {
    //         return res[n-1];
    //     }
    //     res[n-1]=climbStairs(n-1,res)+climbStairs(n-2,res);
    //     return res[n-1];

    //   }

    //==================================================================================================================================================
    

    // botton up tabulation tc -n  sc- n
    // public int climbStairs(int n) {
    //     if(n==1 || n==2) return n;
    //     int [] res=new int[n];
    //     res[0]=1;
    //     res[1]=2;
    //     for(int i=3;i<=n;i++)
    //     {
    //         res[i-1]=res[i-2]+res[i-3];
    //     }
    //     return res[n-1];
    //    }

       //==================================================================================================================================================
    

    // botton up tabulation tc -n  sc- 1
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int p=2,pp=1,res=0;
        for(int i=3;i<=n;i++)
        {
            res=p+pp;
            pp=p;
            p=res;

        }
        return res;
       }
}